SUMMARY = "A Python library for rich text and beautiful formatting in the terminal"
DESCRIPTION = "Render rich text, tables, progress bars, syntax highlighting, \
markdown and more to the terminal."
LICENSE = "MIT"

PV = "13.4.2"

RPM_NAME = "python311-rich-13.4.2-1.1.noarch.rpm"
RPM_HASH = "d5ad6bccf69c48c381d281f6358b27429afa0c006141bd197bf7f7d14767c109ab08f42f13be3a1688623981f41e5a10b371d67c221dc97ca6274c4ba5ab155e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rich \
python3.11dist-rich \
python311-rich \
python3dist-rich"

RDEPENDS:${PN} += "python-abi \
python311-markdown-it-py \
python311-pygments"

inherit rpm
