SUMMARY = "Development files for numba applications"
DESCRIPTION = "This package contains files for developing applications using numba."
LICENSE = "BSD-2-Clause"

PV = "0.57.0"

RPM_NAME = "python310-numba-devel-0.57.0-1.3.aarch64.rpm"
RPM_HASH = "10145c3d92b1c9a2292b4207731d32a2c0057d462d1e918c3e0c1ea441cbf18176b746485ad8d0632d53b83e1fb76a123a814d74be2813cf8f5dc759748ba872"

RPROVIDES:${PN} += "python310-numba-devel"

RDEPENDS:${PN} += "-python310-numpy-devel >= 1.21 with python310-numpy-devel < 1.25 \
python-abi \
python310-devel \
python310-numba"

inherit rpm
