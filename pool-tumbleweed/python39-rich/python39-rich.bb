SUMMARY = "A Python library for rich text and beautiful formatting in the terminal"
DESCRIPTION = "Render rich text, tables, progress bars, syntax highlighting, \
markdown and more to the terminal."
LICENSE = "MIT"

PV = "13.4.1"

RPM_NAME = "python39-rich-13.4.1-1.1.noarch.rpm"
RPM_HASH = "1b5b6bd0bce9605cbdf9a98624815385747779d08ba20955e2a307e5c42e30934c44830c6c0e47d0c7a3127a72b54b51754c18d824198ccd2c5c69aa4ed3a563"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-rich \
python39-rich \
python3dist-rich"

RDEPENDS:${PN} += "python-abi \
python39-markdown-it-py \
python39-pygments"

inherit rpm
