SUMMARY = "Development files for numpy applications"
DESCRIPTION = "This package contains files for developing applications using numpy."
LICENSE = "BSD-3-Clause"

PV = "1.24.2"

RPM_NAME = "python311-numpy_1_24_2-gnu-hpc-devel-1.24.2-4.1.aarch64.rpm"
RPM_HASH = "35a0acba169c61eb78c37bd52a37e4986aa3bbdf376a22e294bf2ccdae749b11ac2d7ed34851c8b693b1778707bd6b429b668333429cca77b18101e7b40824ac"

RPROVIDES:${PN} += "python3-numpy-1-24-2-gnu-hpc-devel \
python311-numpy-1-24-2-gnu-hpc-devel"

RDEPENDS:${PN} += "libopenblas-gnu-hpc-devel \
python-abi \
python311-devel \
python311-numpy-1-24-2-gnu-hpc"

inherit rpm
