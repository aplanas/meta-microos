SUMMARY = "A Python library for rich text and beautiful formatting in the terminal"
DESCRIPTION = "Render rich text, tables, progress bars, syntax highlighting, \
markdown and more to the terminal."
LICENSE = "MIT"

PV = "13.4.2"

RPM_NAME = "python310-rich-13.4.2-2.1.noarch.rpm"
RPM_HASH = "6b9f162387daf0163e9629f24bd835a2afcc71b684c83e9f5cc2f6140a62963e5a8ea62e0daf84a792359528ef70c584ace2d901dcb79056e4a8dbab79b9630c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-rich \
python310-rich \
python3dist-rich"

RDEPENDS:${PN} += "python-abi \
python310-markdown-it-py \
python310-pygments"

inherit rpm
