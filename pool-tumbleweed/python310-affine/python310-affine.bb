SUMMARY = "Affine transformation matrices"
DESCRIPTION = "Matrices describing affine transformation of the plane."
LICENSE = "BSD-3-Clause"

PV = "2.3.1"

RPM_NAME = "python310-affine-2.3.1-1.5.noarch.rpm"
RPM_HASH = "d174f70faf07f6c52091ac1d11f588910ddc974c4c951af6ac94c5cf04a2585a0ba7907a094686520a3bd67c92e93545b3e9750b0e78a48c30c29f24a42fb777"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-affine \
python310-affine \
python3dist-affine"

RDEPENDS:${PN} += "python-abi"

inherit rpm
