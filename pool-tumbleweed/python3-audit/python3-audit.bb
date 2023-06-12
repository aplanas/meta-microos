SUMMARY = "Python3 Bindings for libaudit"
DESCRIPTION = "The audit-libs-python3 package contains the bindings for using libaudit \
by python3."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.9"

RPM_NAME = "python3-audit-3.0.9-1.3.aarch64.rpm"
RPM_HASH = "bd141aa7af0e33081c409fca221c930af89ec2d3090e7bc30916863dc64a8c9550b4ed91bc013f3a5f4bada37e238528756af4d4be6890d5cc13c57f62b26988"

RPROVIDES:${PN} += "audit-libs-python3 \
python3-audit \
python3-audit(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libaudit.so.1()(64bit) \
libauparse.so.0()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
