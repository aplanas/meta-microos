SUMMARY = "The GNU Compiler Collection targeting hppa"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting hppa. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-hppa-gcc7-7.5.0+r278197-14.1.aarch64.rpm"
RPM_HASH = "4ed0864857ab6e279864fe66e298cac0e5f2936093c645b4cb76b2a9cd0bf2a56d18b6a68561b65214156453aba80d5caaeab81ef67640668975c7bb874a2547"

RPROVIDES:${PN} += "cross-hppa-gcc7 \
cross-hppa-gcc7(aarch-64) \
liblto_plugin.so.0()(64bit)"
RDEPENDS:${PN} += "/bin/sh \
cross-hppa-binutils \
libc.so.6(GLIBC_2.36)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libmpc.so.3()(64bit) \
libmpfr.so.6()(64bit) \
libz.so.1()(64bit) \
update-alternatives"

inherit rpm
