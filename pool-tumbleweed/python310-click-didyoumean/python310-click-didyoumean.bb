SUMMARY = "Plugin to enable git-like did-you-mean feature in python-click"
DESCRIPTION = "This package enables a git-like did-you-mean feature in click."
LICENSE = "MIT"

PV = "0.0.3"

RPM_NAME = "python310-click-didyoumean-0.0.3-4.12.noarch.rpm"
RPM_HASH = "7f23551f86ecf12944444698fdadc362fe6a98aecc1c96c640242dbf1f9392c9c7045310b8c41050cffe850a2cbfb54d334e8b799c48ce89f2bca5502397f094"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-click-didyoumean \
python3.10dist-click-didyoumean \
python310-click-didyoumean \
python3dist-click-didyoumean"

RDEPENDS:${PN} += "python-abi \
python310-click"

inherit rpm
