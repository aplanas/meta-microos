SUMMARY = "A set of objects for performing math operations on font data"
DESCRIPTION = "A set of objects for performing math operations on font data."
LICENSE = "MIT"

PV = "0.9.3"

RPM_NAME = "python311-fontMath-0.9.3-1.5.noarch.rpm"
RPM_HASH = "319db9976e4db441bb7bfa0f2d147d6dfc7da911d21b0c1ac8cbdd9ab11b285aa959293b8cc346bdce46dfa2d2ff476121cba7630efc51cd17a92d22da42378d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fontMath \
python3.11dist-fontmath \
python311-fontMath \
python3dist-fontmath"

RDEPENDS:${PN} += "python-abi \
python311-FontTools"

inherit rpm
