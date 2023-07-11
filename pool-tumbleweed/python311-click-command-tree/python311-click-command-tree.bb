SUMMARY = "Plugin for click to show the command tree of your CLI"
DESCRIPTION = "click-command-tree is a click plugin to show the command tree of your CLI"
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python311-click-command-tree-1.1.1-1.1.noarch.rpm"
RPM_HASH = "daa0ca4555ebc57e0754d050b86db5702ba13a2f20d114042931c0f3f151269b15774ad63173d8e6dae3986d77e91b1520dd2967994076a7f5218a3f0ee46138"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-click-command-tree \
python3.11dist-click-command-tree \
python311-click-command-tree \
python3dist-click-command-tree"

RDEPENDS:${PN} += "python-abi \
python311-click"

inherit rpm
