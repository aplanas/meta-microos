SUMMARY = "Python JSON decoder that can extract data from dirty input"
DESCRIPTION = "JSON decoder for Python that can extract data from dirty input."
LICENSE = "MIT"

PV = "1.0.8"

RPM_NAME = "python310-dirtyjson-1.0.8-1.5.noarch.rpm"
RPM_HASH = "b07ec2efee354ef436484fc42d6201689a89fa298ccc3118096cea344f1243a506fe0baeec15a4c33959182af09993dfe3f3ee5f742283e8ceb21b2d1fc60b79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-dirtyjson \
python310-dirtyjson \
python3dist-dirtyjson"

RDEPENDS:${PN} += "python-abi"

inherit rpm
