SUMMARY = "The GNU Compiler Collection targeting x86_64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting x86_64. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-x86_64-gcc7-7.5.0+r278197-14.1.aarch64.rpm"
RPM_HASH = "e6c5b6334ae42b52c266d90dd805ff26a890dc57b39f03c65edd146df173148e3945b64585e5cb598ac4a64ae2b4aa8fc4e7606369b550a6de10078d6861abc1"

RPROVIDES:${PN} += "cross-x86_64-gcc7 \
cross-x86_64-gcc7(aarch-64) \
liblto_plugin.so.0()(64bit)"
RDEPENDS:${PN} += "/bin/sh \
cross-x86_64-binutils \
libc.so.6(GLIBC_2.36)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libmpc.so.3()(64bit) \
libmpfr.so.6()(64bit) \
libz.so.1()(64bit) \
update-alternatives"

inherit rpm
