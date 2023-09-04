SUMMARY = "Development files for numba applications"
DESCRIPTION = "This package contains files for developing applications using numba."
LICENSE = "BSD-2-Clause"

PV = "0.57.1"

RPM_NAME = "python310-numba-devel-0.57.1-2.1.aarch64.rpm"
RPM_HASH = "3f50c50db267e7059f71b2f715310351da0c21dc75392e1259be5d1991112d0fa548749525328ad9bf77641a3b913300224bc9c8b91470334c6e2774caa74d3b"

RPROVIDES:${PN} += "python310-numba-devel"

RDEPENDS:${PN} += "python-abi \
python310-devel \
python310-numba \
python310-numpy-devel"

inherit rpm
