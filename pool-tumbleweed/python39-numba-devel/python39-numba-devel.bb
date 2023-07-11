SUMMARY = "Development files for numba applications"
DESCRIPTION = "This package contains files for developing applications using numba."
LICENSE = "BSD-2-Clause"

PV = "0.57.0"

RPM_NAME = "python39-numba-devel-0.57.0-1.3.aarch64.rpm"
RPM_HASH = "437b1a941574fcfaa70cafa58a478c13c0dbb70181d43242422395f0670981c791a1b1ad5829a4286a5444539e9aed9426c8c962dd7c53ea6c7091f973bccc7a"

RPROVIDES:${PN} += "python39-numba-devel"

RDEPENDS:${PN} += "-python39-numpy-devel >= 1.21 with python39-numpy-devel < 1.25 \
python-abi \
python39-devel \
python39-numba"

inherit rpm
