SUMMARY = "The GNU Compiler Collection targeting arm-none"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting arm-none. \
 \
 \
 \
 \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-arm-none-gcc7-bootstrap-7.5.0+r278197-12.5.aarch64.rpm"
RPM_HASH = "7250ba1316f90f32a9286b847077ef3a216fa23d2438a350c7cde44fa7c34936b2ed9edea5e0dffe331ad7da3381d9a58f77f00a8eaeece1c3c98dbb5c171de2"

RPROVIDES:${PN} += "arm-none-eabi-gcc cross-arm-none-gcc7-bootstrap cross-arm-none-gcc7-bootstrap(aarch-64) liblto_plugin.so.0()(64bit)"
RDEPENDS:${PN} += "/bin/sh cross-arm-binutils libc.so.6(GLIBC_2.36)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libz.so.1()(64bit) update-alternatives"

inherit rpm
