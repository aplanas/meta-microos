SUMMARY = "Development files for numba applications"
DESCRIPTION = "This package contains files for developing applications using numba."
LICENSE = "BSD-2-Clause"

PV = "0.57.0"

RPM_NAME = "python39-numba-devel-0.57.0-1.1.aarch64.rpm"
RPM_HASH = "9ac3c7770e6898e5edf2dbe7e3427bf95450ab6c35cde07518130b6c1943dafe16966a4d7bc740b1f47e8f90e639811536cb2e6720dc0c3e5585adaaec1e0684"

RPROVIDES:${PN} += "python39-numba-devel"

RDEPENDS:${PN} += "-python39-numpy-devel >= 1.21 with python39-numpy-devel < 1.25 \
python-abi \
python39-devel \
python39-numba"

inherit rpm
