SUMMARY = "Collection of plugins for markdown-it-py"
DESCRIPTION = "Collection of core plugins for markdown-it-py."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python311-mdit-py-plugins-0.3.0-3.3.noarch.rpm"
RPM_HASH = "88ce6dab7bf6dbcc4320ce545beaf0a348d01a370102cc3af36e68f51a83b416fe22c097c14b214a79cd0b70da1071e869839687f9ce7fb0e1a8c56dfdc1bc5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mdit-py-plugins \
python3.11dist-mdit-py-plugins \
python311-mdit-py-plugins \
python3dist-mdit-py-plugins"

RDEPENDS:${PN} += "python-abi \
python311-markdown-it-py"

inherit rpm
