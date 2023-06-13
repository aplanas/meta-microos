SUMMARY = "Development files for numba applications"
DESCRIPTION = "This package contains files for developing applications using numba."
LICENSE = "BSD-2-Clause"

PV = "0.57.0"

RPM_NAME = "python310-numba-devel-0.57.0-1.1.aarch64.rpm"
RPM_HASH = "ba405db9ed0e7fee2e5d1c23e650db09c14553c77e06ab59d161a44bd6f383c59113f1245938cfd60fcc346368a65593de594497e834fd8c25c7964db04f435e"

RPROVIDES:${PN} += "python3-numba-devel \
python310-numba-devel \
python310-numba-devel(aarch-64)"

RDEPENDS:${PN} += "(python310-numpy-devel >= 1.21 with python310-numpy-devel < 1.25) \
python(abi) \
python310-devel \
python310-numba"

inherit rpm
