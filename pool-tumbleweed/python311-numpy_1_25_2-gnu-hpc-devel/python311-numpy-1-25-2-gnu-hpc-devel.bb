SUMMARY = "Development files for numpy applications"
DESCRIPTION = "This package contains files for developing applications using numpy."
LICENSE = "BSD-3-Clause"

PV = "1.25.2"

RPM_NAME = "python311-numpy_1_25_2-gnu-hpc-devel-1.25.2-1.1.aarch64.rpm"
RPM_HASH = "6c9195a7458bfb560d580ba5fa52cdebbb3a25edd68420d2acdd2ad9e22d5b07e4d3ac72421d279797e8af3e4242c1cbb88f6e3f47c8119fadea103b38706c67"

RPROVIDES:${PN} += "python3-numpy-1-25-2-gnu-hpc-devel \
python311-numpy-1-25-2-gnu-hpc-devel"

RDEPENDS:${PN} += "libopenblas-gnu-hpc-devel \
python-abi \
python311-devel \
python311-numpy-1-25-2-gnu-hpc"

inherit rpm
