SUMMARY = "Plugin to enable git-like did-you-mean feature in python-click"
DESCRIPTION = "This package enables a git-like did-you-mean feature in click."
LICENSE = "MIT"

PV = "0.0.3"

RPM_NAME = "python39-click-didyoumean-0.0.3-5.3.noarch.rpm"
RPM_HASH = "ed6d71d40b62f78ea52bba8bdf3d8c53d59601df6b3e8853f84996a42dcc7c90b3a64c9899facf5b973454312ac8fb35b40c66e46703798b111fdfa86e8213f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-click-didyoumean \
python39-click-didyoumean \
python3dist-click-didyoumean"

RDEPENDS:${PN} += "python-abi \
python39-click"

inherit rpm
