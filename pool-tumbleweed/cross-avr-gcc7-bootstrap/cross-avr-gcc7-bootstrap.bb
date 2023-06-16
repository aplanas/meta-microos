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

RPM_NAME = "cross-avr-gcc7-bootstrap-7.5.0+r278197-14.1.aarch64.rpm"
RPM_HASH = "0fd4d829c435b919b6d732e378418cb81d1271dc7b44ad56743b42ce338d00e0df2d8e1bfaff66ba14d2a8acab17d29047014824725623b1d05486512ccafafc"

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
