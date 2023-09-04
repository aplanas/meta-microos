SUMMARY = "Development files for numpy applications"
DESCRIPTION = "This package contains files for developing applications using numpy."
LICENSE = "BSD-3-Clause"

PV = "1.25.2"

RPM_NAME = "python310-numpy-devel-1.25.2-1.1.aarch64.rpm"
RPM_HASH = "eba3eaa2bb0c6677835cf2f5de6fb291694c68b6e3367e32bd846d89fcc6ba0098cb9c080cc9c014b4e6b477c3c218ff049e0d80bba02dce6fe488e697e97291"

RPROVIDES:${PN} += "python310-numpy-devel"

RDEPENDS:${PN} += "blas-devel \
cblas-devel \
lapack-devel \
python-abi \
python310-devel \
python310-numpy"

inherit rpm
