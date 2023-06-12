SUMMARY = "The GNU Compiler Collection targeting ppc64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting ppc64. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-ppc64-gcc7-7.5.0+r278197-14.1.aarch64.rpm"
RPM_HASH = "9563fdd4a336bb4a5f6ece51783cfa82daa069f82e3db978b12712532521b9c5aa843db801d596fbfcc79b969d4ebf9b1b3acf24a9b03a5bdc65bcb8e0d79eb3"

RPROVIDES:${PN} += "cross-ppc64-gcc7 \
cross-ppc64-gcc7(aarch-64) \
liblto_plugin.so.0()(64bit)"
RDEPENDS:${PN} += "/bin/sh \
cross-ppc64-binutils \
libc.so.6(GLIBC_2.36)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libmpc.so.3()(64bit) \
libmpfr.so.6()(64bit) \
libz.so.1()(64bit) \
update-alternatives"

inherit rpm
