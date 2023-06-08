SUMMARY = "The GNU Compiler Collection targeting x86_64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting x86_64. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-x86_64-gcc7-7.5.0+r278197-12.5.aarch64.rpm"
RPM_HASH = "90782e69cecf06e3c29210a31d6e40c1483c21748739d7ed10e7623d753bfe163282a9072ae0d1b7f4499a82e179a83095b3d5cec719bbdb71843133f1b200ef"

RPROVIDES:${PN} += "cross-x86_64-gcc7 cross-x86_64-gcc7(aarch-64) liblto_plugin.so.0()(64bit)"
RDEPENDS:${PN} += "/bin/sh cross-x86_64-binutils libc.so.6(GLIBC_2.36)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libz.so.1()(64bit) update-alternatives"

inherit rpm
