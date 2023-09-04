SUMMARY = "Development files for numba applications"
DESCRIPTION = "This package contains files for developing applications using numba."
LICENSE = "BSD-2-Clause"

PV = "0.57.1"

RPM_NAME = "python311-numba-devel-0.57.1-2.1.aarch64.rpm"
RPM_HASH = "8d7e92ceeff8292367f449b29954f0f9c9578926c3d9ff55b7bad603cefbcc20ce274e0c9401bd8a6f4283ca12a846961c6bdb7c8dd75733f0ee7143bffb753f"

RPROVIDES:${PN} += "python3-numba-devel \
python311-numba-devel"

RDEPENDS:${PN} += "python-abi \
python311-devel \
python311-numba \
python311-numpy-devel"

inherit rpm
