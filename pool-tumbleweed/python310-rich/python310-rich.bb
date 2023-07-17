SUMMARY = "A Python library for rich text and beautiful formatting in the terminal"
DESCRIPTION = "Render rich text, tables, progress bars, syntax highlighting, \
markdown and more to the terminal."
LICENSE = "MIT"

PV = "13.4.2"

RPM_NAME = "python310-rich-13.4.2-1.1.noarch.rpm"
RPM_HASH = "a8ac6d357d4e4850ec175d12958f7052c6c42d3980e1124db357ab165a84ac3e0a826c8544084a7a19c94ff7517b9e4ffc78b2a6bdd71fdea659f454d335e12a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-rich \
python310-rich \
python3dist-rich"

RDEPENDS:${PN} += "python-abi \
python310-markdown-it-py \
python310-pygments"

inherit rpm
