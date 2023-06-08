SUMMARY = "GNU D Compiler"
DESCRIPTION = "This package contains a D compiler and associated development \
files based on the GNU GCC technology."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "gcc12-d-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "86d5f69ae2e3f9801f13571a885dfd7af9619990450764f7ce8b47252e9088dafbe4c0eb9932f01f13a71e3575fd5dba61d9f928db59e2de52839c171acff518"

RPROVIDES:${PN} += "gcc12-d gcc12-d(aarch-64)"
RDEPENDS:${PN} += "gcc12 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.36)(64bit) libgdruntime3 libgmp.so.10()(64bit) libgphobos3 libisl.so.23()(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libz.so.1()(64bit) libzstd.so.1()(64bit)"

inherit rpm
