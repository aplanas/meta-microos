SUMMARY = "A Python library for rich text and beautiful formatting in the terminal"
DESCRIPTION = "Render rich text, tables, progress bars, syntax highlighting, \
markdown and more to the terminal."
LICENSE = "MIT"

PV = "13.4.2"

RPM_NAME = "python311-rich-13.4.2-2.1.noarch.rpm"
RPM_HASH = "4144d1ffd985749b017a92dea140b57dfc527f53d1662aecdeadded6fbbea1c4fb9ca3e945bde1b5c01960845fade2e5d1b48b5d5e0f586f05d7df6ba54787cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rich \
python3.11dist-rich \
python311-rich \
python3dist-rich"

RDEPENDS:${PN} += "python-abi \
python311-markdown-it-py \
python311-pygments"

inherit rpm
