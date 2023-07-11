SUMMARY = "Development files for numba applications"
DESCRIPTION = "This package contains files for developing applications using numba."
LICENSE = "BSD-2-Clause"

PV = "0.57.0"

RPM_NAME = "python311-numba-devel-0.57.0-1.3.aarch64.rpm"
RPM_HASH = "05af3919f3fb4b6f55393dc1f8f0e4f37bc5753280134d4695679c566c52bcb529ff22193e1cfc80a74957eb06e3dee767c6bd95c086efeef9ae4d0596c9299b"

RPROVIDES:${PN} += "python3-numba-devel \
python311-numba-devel"

RDEPENDS:${PN} += "-python311-numpy-devel >= 1.21 with python311-numpy-devel < 1.25 \
python-abi \
python311-devel \
python311-numba"

inherit rpm
