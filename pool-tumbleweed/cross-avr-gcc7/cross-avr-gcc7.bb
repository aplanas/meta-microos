SUMMARY = "The GNU Compiler Collection targeting avr"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting avr."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-avr-gcc7-7.5.0+r278197-14.2.aarch64.rpm"
RPM_HASH = "c7333d782d65c1f1ce0c38c289271b4af3c1ec8f3cb206766f22b6a0956d9ad34e351f10228a86e27803c7904ca9ec952b99f1f3ea211e4b8a6b4c5f13fd73c8"

RPROVIDES:${PN} += "cross-avr-gcc7 \
liblto-plugin.so.0"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-avr-binutils \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
update-alternatives"

inherit rpm
