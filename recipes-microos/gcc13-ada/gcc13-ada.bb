SUMMARY = "GNU Ada Compiler Based on GCC (GNAT)"
DESCRIPTION = "This package contains an Ada compiler and associated development \
tools based on the GNU GCC technology."
LICENSE = "GPL-3.0-or-later"

PV = "13.0.1+git7231"

RPM_NAME = "gcc13-ada-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "5c972bedadbd1386cbbc461f12a672062e77410faa29edb28cd4158cf2098dd708113776a4a5bc1ae472f102de181d50c1d5310e80ebceec8ab59bc05d482d77"

RPROVIDES:${PN} += "gcc13-ada gcc13-ada(aarch-64)"
RDEPENDS:${PN} += "gcc13 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libada13 libc.so.6(GLIBC_2.36)(64bit) libgmp.so.10()(64bit) libisl.so.23()(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libz.so.1()(64bit) libzstd.so.1()(64bit)"

inherit rpm
