SUMMARY = "Development files for numba applications"
DESCRIPTION = "This package contains files for developing applications using numba."
LICENSE = "BSD-2-Clause"

PV = "0.57.1"

RPM_NAME = "python39-numba-devel-0.57.1-2.1.aarch64.rpm"
RPM_HASH = "79c3021d1cb55b35ffabc93057250d2807c29f116b11a9d59c0af058d42dc312db9a3ce3d2f1e9a608e545793353c471f3f95958c20c18aa8e7e0e98ff2f41dc"

RPROVIDES:${PN} += "python39-numba-devel"

RDEPENDS:${PN} += "python-abi \
python39-devel \
python39-numba \
python39-numpy-devel"

inherit rpm
