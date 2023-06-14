SUMMARY = "A Python library for rich text and beautiful formatting in the terminal"
DESCRIPTION = "Render rich text, tables, progress bars, syntax highlighting, \
markdown and more to the terminal."
LICENSE = "MIT"

PV = "13.4.1"

RPM_NAME = "python311-rich-13.4.1-1.1.noarch.rpm"
RPM_HASH = "db65aa22322ea87e65cd18c8053359fb8cd231bc4941ea8f2bcb7b0248d5fdf8dd42d0be7bc868f83d8ecff36f2d9d9e3cecd9789b7bcdae7ab122d1e9c64758"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-rich \
python311-rich \
python3dist-rich"

RDEPENDS:${PN} += "python-abi \
python311-markdown-it-py \
python311-pygments"

inherit rpm
