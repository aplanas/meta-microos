SUMMARY = "Plugin to enable git-like did-you-mean feature in python-click"
DESCRIPTION = "This package enables a git-like did-you-mean feature in click."
LICENSE = "MIT"

PV = "0.0.3"

RPM_NAME = "python311-click-didyoumean-0.0.3-5.3.noarch.rpm"
RPM_HASH = "bdc8768f6a18be2180a185ada27bac62c29ac1f8666b11d6ce54fb0f9cff7cca4e6140ea711f49a35fd403fed31d12d1582b78cdb4e8862fa02f36cd9ed06008"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-click-didyoumean \
python3.11dist-click-didyoumean \
python311-click-didyoumean \
python3dist-click-didyoumean"

RDEPENDS:${PN} += "python-abi \
python311-click"

inherit rpm
