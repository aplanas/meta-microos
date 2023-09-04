SUMMARY = "Development files for numpy applications"
DESCRIPTION = "This package contains files for developing applications using numpy."
LICENSE = "BSD-3-Clause"

PV = "1.25.2"

RPM_NAME = "python39-numpy-devel-1.25.2-1.1.aarch64.rpm"
RPM_HASH = "aa2d9c6bb9bac6f82f6cbcb8902e3965aa8d7bd68523ee3c67ba20d3af39b72cfb286cbc68d7a0ea2ebacaa37d2d4ef5476e30bacd263279765c06b6ada99a72"

RPROVIDES:${PN} += "python39-numpy-devel"

RDEPENDS:${PN} += "blas-devel \
cblas-devel \
lapack-devel \
python-abi \
python39-devel \
python39-numpy"

inherit rpm
