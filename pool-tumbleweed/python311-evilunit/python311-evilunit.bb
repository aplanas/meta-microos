SUMMARY = "Python unittest helpers"
DESCRIPTION = "evilunit provides helpers for Python unittest, \
including class level imports, parameterized tests \
and nested test classes."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python311-evilunit-0.2.1-1.14.noarch.rpm"
RPM_HASH = "8164a48a39ae9caad88a3e2294fdee7dd6f171aecce41880d47b46383f91276e259a114930e10cc7dca25f5e62ea22e21b01a2365177c2e5503322a1b3cddd59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-evilunit \
python3.11dist-evilunit \
python311-evilunit \
python3dist-evilunit"

RDEPENDS:${PN} += "python-abi \
python311-setuptools"

inherit rpm
