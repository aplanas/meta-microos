SUMMARY = "Plugin to enable git-like did-you-mean feature in python-click"
DESCRIPTION = "This package enables a git-like did-you-mean feature in click."
LICENSE = "MIT"

PV = "0.0.3"

RPM_NAME = "python310-click-didyoumean-0.0.3-5.3.noarch.rpm"
RPM_HASH = "62f78a31943542918493e94657689126b82a8a43013593fbc13b88ce9e3708e0a26c1f52ae5aabb851b4286e09f36d98a02373872a492c9ccf26cc6439d4f2a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-click-didyoumean \
python310-click-didyoumean \
python3dist-click-didyoumean"

RDEPENDS:${PN} += "python-abi \
python310-click"

inherit rpm
