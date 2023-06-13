SUMMARY = "The GNU Compiler Collection targeting sparc64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting sparc64. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-sparc64-gcc7-7.5.0+r278197-14.1.aarch64.rpm"
RPM_HASH = "cc8517f3fb02bb713719a3ea0ef2af962642cffbad3b5fd9571e83eadd20b17f4f81118620704c1865f701bc8140a11485fee9c99f42066fe2dfb24e9e5b7014"

RPROVIDES:${PN} += "cross-sparc64-gcc7 \
cross-sparc64-gcc7(aarch-64) \
liblto_plugin.so.0()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
cross-sparc64-binutils \
libc.so.6(GLIBC_2.36)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libmpc.so.3()(64bit) \
libmpfr.so.6()(64bit) \
libz.so.1()(64bit) \
update-alternatives"

inherit rpm
