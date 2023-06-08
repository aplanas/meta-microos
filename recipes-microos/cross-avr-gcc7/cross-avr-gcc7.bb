SUMMARY = "The GNU Compiler Collection targeting avr"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting avr."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-avr-gcc7-7.5.0+r278197-12.5.aarch64.rpm"
RPM_HASH = "8b378e1f31e01a3bdda007cfe66f14d6b005dfcad9477524c8b2c6fbd71106666e54ea00407aa11028be2436201bf9a5eac7f54d5e3ccded31338e3e3326f78b"

RPROVIDES:${PN} += "cross-avr-gcc7 cross-avr-gcc7(aarch-64) liblto_plugin.so.0()(64bit)"
RDEPENDS:${PN} += "/bin/sh cross-avr-binutils libc.so.6(GLIBC_2.36)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libz.so.1()(64bit) update-alternatives"

inherit rpm
