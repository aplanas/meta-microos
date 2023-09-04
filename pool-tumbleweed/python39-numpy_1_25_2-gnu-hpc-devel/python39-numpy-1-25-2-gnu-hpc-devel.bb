SUMMARY = "Development files for numpy applications"
DESCRIPTION = "This package contains files for developing applications using numpy."
LICENSE = "BSD-3-Clause"

PV = "1.25.2"

RPM_NAME = "python39-numpy_1_25_2-gnu-hpc-devel-1.25.2-1.1.aarch64.rpm"
RPM_HASH = "f0453e0fd1fec6c5dd19df96a210587bb856a11ac9bdf3b37d4760c7ea09dbc7b4a996cd7bf2a5301682082adfa4af9a7b15e96768ad17ed143033e1bc78abe4"

RPROVIDES:${PN} += "python39-numpy-1-25-2-gnu-hpc-devel"

RDEPENDS:${PN} += "libopenblas-gnu-hpc-devel \
python-abi \
python39-devel \
python39-numpy-1-25-2-gnu-hpc"

inherit rpm
