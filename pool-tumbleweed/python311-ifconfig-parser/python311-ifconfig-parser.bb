SUMMARY = "Python package for parsing raw output of ifconfig"
DESCRIPTION = "Python package for parsing raw output of ifconfig."
LICENSE = "MIT"

PV = "0.0.5"

RPM_NAME = "python311-ifconfig-parser-0.0.5-1.14.noarch.rpm"
RPM_HASH = "cd660cf92c3ab37749393090df64f27b07a53eccdd900a5cbcd8f796dcb9a16738f1c3c89cc5a94d7685dfe9294158aa8b5940c7a140e42c74b1f5e8c50a825f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ifconfig-parser) \
python311-ifconfig-parser \
python3dist(ifconfig-parser)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
