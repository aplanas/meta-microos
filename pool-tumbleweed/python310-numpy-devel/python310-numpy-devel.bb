SUMMARY = "Development files for numpy applications"
DESCRIPTION = "This package contains files for developing applications using numpy."
LICENSE = "BSD-3-Clause"

PV = "1.24.2"

RPM_NAME = "python310-numpy-devel-1.24.2-4.1.aarch64.rpm"
RPM_HASH = "b737fdd6ef2c9c65f2b681315151326b563cea63c9c6f3b8c3620765179ec865f6686868401084d159303f1889d29e7d971a5789d68915693e9820833c3fbf9a"

RPROVIDES:${PN} += "python310-numpy-devel"

RDEPENDS:${PN} += "blas-devel \
cblas-devel \
lapack-devel \
python-abi \
python310-devel \
python310-numpy"

inherit rpm
