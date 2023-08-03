SUMMARY = "A Python library for rich text and beautiful formatting in the terminal"
DESCRIPTION = "Render rich text, tables, progress bars, syntax highlighting, \
markdown and more to the terminal."
LICENSE = "MIT"

PV = "13.4.2"

RPM_NAME = "python39-rich-13.4.2-2.1.noarch.rpm"
RPM_HASH = "944ff4e3d7e0b1436c088221b2749629f8054954f5876af774615ae5314ede61a17ed1cb745b7bcb685fb9d998b7fc8e253516f40200a20bb5285471022c1bbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-rich \
python39-rich \
python3dist-rich"

RDEPENDS:${PN} += "python-abi \
python39-markdown-it-py \
python39-pygments"

inherit rpm
