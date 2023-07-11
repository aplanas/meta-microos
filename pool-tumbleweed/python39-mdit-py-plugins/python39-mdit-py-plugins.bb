SUMMARY = "Collection of plugins for markdown-it-py"
DESCRIPTION = "Collection of core plugins for markdown-it-py."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python39-mdit-py-plugins-0.3.0-3.3.noarch.rpm"
RPM_HASH = "b706094db5b5b1ddcf3d627e0074016c6cd9331369b9a16862967a630d51ac06926299b3cdefd3b8e5769ea66f2aec3f20bfaa16892682c271be3e725d56f62b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mdit-py-plugins \
python39-mdit-py-plugins \
python3dist-mdit-py-plugins"

RDEPENDS:${PN} += "python-abi \
python39-markdown-it-py"

inherit rpm
