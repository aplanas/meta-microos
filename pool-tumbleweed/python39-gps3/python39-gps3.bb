SUMMARY = "Python interface for gpsd"
DESCRIPTION = "Python interface for gpsd."
LICENSE = "MIT"

PV = "0.33.3+git.20171101"

RPM_NAME = "python39-gps3-0.33.3+git.20171101-1.19.noarch.rpm"
RPM_HASH = "297d0dcd35e1cf8e555150e8d305ca2ab626bcfa1d7e21ace09e30a16aa320c1bb1d9f03d5a86e0bb5e8c157d44859fa08545328ff1dff2bc5e4f74c1bb3c891"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(gps3) \
python39-gps3 \
python3dist(gps3)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
