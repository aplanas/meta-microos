SUMMARY = "The GNU Compiler Collection targeting hppa"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting hppa. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-hppa-gcc7-7.5.0+r278197-12.5.aarch64.rpm"
RPM_HASH = "c36dd321c3c2685bf50bde746224b34fb961a247c9796de6d3dfbf27cc8a489c2ffcead58519b8b0a86f6918772bf847c9db02b357969b2965beafd9ef14cc37"

RPROVIDES:${PN} += "cross-hppa-gcc7 cross-hppa-gcc7(aarch-64) liblto_plugin.so.0()(64bit)"
RDEPENDS:${PN} += "/bin/sh cross-hppa-binutils libc.so.6(GLIBC_2.36)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libz.so.1()(64bit) update-alternatives"

inherit rpm
