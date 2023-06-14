SUMMARY = "Development files for numpy applications"
DESCRIPTION = "This package contains files for developing applications using numpy."
LICENSE = "BSD-3-Clause"

PV = "1.24.2"

RPM_NAME = "python39-numpy_1_24_2-gnu-hpc-devel-1.24.2-3.1.aarch64.rpm"
RPM_HASH = "3f3f87e91d1046f80834a6d75d1b06890972d5e48ec40435e72673681f69f2d6cafc308b250c271067f4d2f903d927409447bdf964745dae4328d635c8a2ab48"

RPROVIDES:${PN} += "python39-numpy-1-24-2-gnu-hpc-devel"

RDEPENDS:${PN} += "libopenblas-gnu-hpc-devel \
python-abi \
python39-devel \
python39-numpy-1-24-2-gnu-hpc"

inherit rpm
