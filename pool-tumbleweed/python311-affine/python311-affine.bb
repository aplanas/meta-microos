SUMMARY = "Affine transformation matrices"
DESCRIPTION = "Matrices describing affine transformation of the plane."
LICENSE = "BSD-3-Clause"

PV = "2.3.1"

RPM_NAME = "python311-affine-2.3.1-1.3.noarch.rpm"
RPM_HASH = "3fc5aee3260a79291be1068602bcac6ea9b0f70e4c1d5d0e76df1e5a281ee670fbf7431e9904c17cacc458f9c2cb7bb4a8d5f04216b41f6dd28f17bbf53dd1ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(affine) \
python311-affine \
python3dist(affine)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
