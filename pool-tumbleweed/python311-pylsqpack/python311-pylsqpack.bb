SUMMARY = "Python ls-qpack QPACK library"
DESCRIPTION = "Python wrapper for the ls-qpack QPACK library."
LICENSE = "BSD-3-Clause"

PV = "0.3.16"

RPM_NAME = "python311-pylsqpack-0.3.16-1.4.aarch64.rpm"
RPM_HASH = "05edd974a4ed832fbfd8c8e4ecb05ee5e1b3dfa8739cf34b1d29a37600249ddab5537326bcfa468fc9c15e52c919f2fb70b9522a922232381ecbe354ef8082cb"

RPROVIDES:${PN} += "python3.11dist(pylsqpack) \
python311-pylsqpack \
python311-pylsqpack(aarch-64) \
python3dist(pylsqpack)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
python(abi)"

inherit rpm
