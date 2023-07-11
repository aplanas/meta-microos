SUMMARY = "Plugin for click to show the command tree of your CLI"
DESCRIPTION = "click-command-tree is a click plugin to show the command tree of your CLI"
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python310-click-command-tree-1.1.1-1.1.noarch.rpm"
RPM_HASH = "a205796b4a36d33aac3d3161773d8cbef868c1e784d7ecc5a5d7c0bb9bdc3dad58669beaf90ea513e650fd908c831fae523bbace20fb85a119bc4643d4974f7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-click-command-tree \
python310-click-command-tree \
python3dist-click-command-tree"

RDEPENDS:${PN} += "python-abi \
python310-click"

inherit rpm
