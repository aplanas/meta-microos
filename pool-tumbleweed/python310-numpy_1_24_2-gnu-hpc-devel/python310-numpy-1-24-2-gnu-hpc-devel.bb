SUMMARY = "Development files for numpy applications"
DESCRIPTION = "This package contains files for developing applications using numpy."
LICENSE = "BSD-3-Clause"

PV = "1.24.2"

RPM_NAME = "python310-numpy_1_24_2-gnu-hpc-devel-1.24.2-3.1.aarch64.rpm"
RPM_HASH = "3cfd666c1f4272ddd612cf7565f663bdaf5d413d02c0e5227ae4e8e5d94a9dfa679b39e74fd374d813ed58a8a60263ca00889314f0a56680161a8fa6d75182f8"

RPROVIDES:${PN} += "python3-numpy_1_24_2-gnu-hpc-devel \
python310-numpy_1_24_2-gnu-hpc-devel \
python310-numpy_1_24_2-gnu-hpc-devel(aarch-64)"
RDEPENDS:${PN} += "libopenblas-gnu-hpc-devel \
python(abi) \
python310-devel \
python310-numpy_1_24_2-gnu-hpc"

inherit rpm
