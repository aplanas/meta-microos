SUMMARY = "Computer sound synthesis and composition library"
DESCRIPTION = "Library for csound use \
Csound is a software synthesis program supporting oscillators and \
filters."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.18.1"

RPM_NAME = "libcsound64-6_0-6.18.1-3.1.aarch64.rpm"
RPM_HASH = "eec392545d07e02572b35dc36468efe843470b37190e261830c29e3992ea581c879e756015b8cb2046c71b3293378649ca88e7fb7fa915354dbfb1dcbdba9928"

RPROVIDES:${PN} += "libcsound64-6_0 \
libcsound64-6_0(aarch-64) \
libcsound64.so.6.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libsndfile.so.1()(64bit) \
libsndfile.so.1(libsndfile.so.1.0)(64bit)"

inherit rpm
