SUMMARY = "Affine transformation matrices"
DESCRIPTION = "Matrices describing affine transformation of the plane."
LICENSE = "BSD-3-Clause"

PV = "2.3.1"

RPM_NAME = "python39-affine-2.3.1-1.3.noarch.rpm"
RPM_HASH = "13360cb176f64369d63716e4c1a44c45072e97030d791a3bde25b10b1bedf684f7a7eb37670004869b1d4c94d10a79653ecded6cadb60cc130bfc79834e3ad7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-affine \
python39-affine \
python3dist-affine"

RDEPENDS:${PN} += "python-abi"

inherit rpm
