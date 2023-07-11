SUMMARY = "Development files for numpy applications"
DESCRIPTION = "This package contains files for developing applications using numpy."
LICENSE = "BSD-3-Clause"

PV = "1.24.2"

RPM_NAME = "python310-numpy_1_24_2-gnu-hpc-devel-1.24.2-4.1.aarch64.rpm"
RPM_HASH = "7d07bc0c2e62466ba1355b2540aa586aa3d4d41a3e5e13d08d9c006ce5256e47c563d24fbb5086d63fb807781958ae3515f97168c65285612089b66a86e78372"

RPROVIDES:${PN} += "python310-numpy-1-24-2-gnu-hpc-devel"

RDEPENDS:${PN} += "libopenblas-gnu-hpc-devel \
python-abi \
python310-devel \
python310-numpy-1-24-2-gnu-hpc"

inherit rpm
