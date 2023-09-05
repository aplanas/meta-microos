SUMMARY = "A Python library for rich text and beautiful formatting in the terminal"
DESCRIPTION = "Render rich text, tables, progress bars, syntax highlighting, \
markdown and more to the terminal."
LICENSE = "MIT"

PV = "13.5.2"

RPM_NAME = "python310-rich-13.5.2-1.1.noarch.rpm"
RPM_HASH = "7d8794e8c98e01284fe49caaecbc601658892d3b223983e3de37b9263bfaf6f94b0b8d03e9066848b93994b1129b4084d019f1fb7e685a8e66a9e3c18a443fd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-rich \
python310-rich \
python3dist-rich"

RDEPENDS:${PN} += "python-abi \
python310-markdown-it-py \
python310-pygments"

inherit rpm
