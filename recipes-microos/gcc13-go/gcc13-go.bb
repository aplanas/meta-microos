SUMMARY = "GNU Go Compiler"
DESCRIPTION = "This package contains a Go compiler and associated development \
files based on the GNU GCC technology."
LICENSE = "GPL-3.0-or-later"

PV = "13.0.1+git7231"

RPM_NAME = "gcc13-go-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "5fbead6589fe0e326c40501b4a166ed3712309d8d1a33cf748e1f00a23e90e29c05433e056ff98d64e099aeb134ce518d690f7fc09fc1f0dae96fc92775a2369"

RPROVIDES:${PN} += "gcc13-go gcc13-go(aarch-64)"
RDEPENDS:${PN} += "gcc13 libc.so.6(GLIBC_2.36)(64bit) libgmp.so.10()(64bit) libgo.so.22()(64bit) libgo22 libisl.so.23()(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libz.so.1()(64bit) libzstd.so.1()(64bit)"

inherit rpm
