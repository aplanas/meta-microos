SUMMARY = "Development files for numpy applications"
DESCRIPTION = "This package contains files for developing applications using numpy."
LICENSE = "BSD-3-Clause"

PV = "1.25.2"

RPM_NAME = "python310-numpy_1_25_2-gnu-hpc-devel-1.25.2-1.1.aarch64.rpm"
RPM_HASH = "f78f5174365e15af85fbf0287919c2fa62245d19b3e186a4ac38ad1244f8aac68fd828c0bfaf16b1542e1d0fd6be50310dddf49b59ea8137a6ffd5ace4bbd9b0"

RPROVIDES:${PN} += "python310-numpy-1-25-2-gnu-hpc-devel"

RDEPENDS:${PN} += "libopenblas-gnu-hpc-devel \
python-abi \
python310-devel \
python310-numpy-1-25-2-gnu-hpc"

inherit rpm
