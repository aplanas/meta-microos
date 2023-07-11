SUMMARY = "The GNU Compiler Collection targeting avr"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting avr. \
 \
 \
 \
 \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-avr-gcc7-bootstrap-7.5.0+r278197-14.2.aarch64.rpm"
RPM_HASH = "9dcf50e2c167e645a359233991b6294ac0f4c46bf9b974f16a63105e7e3f1369de505943688d133cb58d09cc8478f04c519561df91895e22e18615bb5ad39972"

RPROVIDES:${PN} += "cross-avr-gcc7-bootstrap \
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
