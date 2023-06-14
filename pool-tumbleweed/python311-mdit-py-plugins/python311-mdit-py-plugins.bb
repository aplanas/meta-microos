SUMMARY = "Collection of plugins for markdown-it-py"
DESCRIPTION = "Collection of core plugins for markdown-it-py."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python311-mdit-py-plugins-0.3.0-2.3.noarch.rpm"
RPM_HASH = "8f9c9c36783ac7c8e352a152b53d7f60e9698abaca4df662cb6900352d3a728d50a491c59523a7e845dc640a25125e5454b011c53a4d2a191f0bae408a126e50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-mdit-py-plugins \
python311-mdit-py-plugins \
python3dist-mdit-py-plugins"

RDEPENDS:${PN} += "python-abi \
python311-markdown-it-py"

inherit rpm
