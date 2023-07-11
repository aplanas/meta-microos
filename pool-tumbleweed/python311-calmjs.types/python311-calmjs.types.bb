SUMMARY = "Types for the calmjs framework"
DESCRIPTION = "A collection of types (mostly exception classes) for use with |calmjs|_."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python311-calmjs.types-1.0.1-2.1.noarch.rpm"
RPM_HASH = "0fec55f0b736c8feb0bd2a0fdb49d9a30b3ac0024efa13e193e83f883219382c0f190fd36d1122d71372423250a7c5a821e452cbd5c66bedbdb8527af75f2411"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-calmjs.types \
python3.11dist-calmjs.types \
python311-calmjs.types \
python3dist-calmjs.types"

RDEPENDS:${PN} += "python-abi \
python311-setuptools"

inherit rpm
