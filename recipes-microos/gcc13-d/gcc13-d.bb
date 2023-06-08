SUMMARY = "GNU D Compiler"
DESCRIPTION = "This package contains a D compiler and associated development \
files based on the GNU GCC technology."
LICENSE = "GPL-3.0-or-later"

PV = "13.0.1+git7231"

RPM_NAME = "gcc13-d-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "fce07ce4eaef6fa1a4b1ee5a43962bd9d0d5b70d1023a9bee2d7c670f9d31ef483d23e989954cb8050545eaec53e9f21f6eae76e2ebc05ff295ffa7b68a1a10e"

RPROVIDES:${PN} += "gcc13-d gcc13-d(aarch-64)"
RDEPENDS:${PN} += "gcc13 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.36)(64bit) libgdruntime4 libgmp.so.10()(64bit) libgphobos4 libisl.so.23()(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libz.so.1()(64bit) libzstd.so.1()(64bit)"

inherit rpm
