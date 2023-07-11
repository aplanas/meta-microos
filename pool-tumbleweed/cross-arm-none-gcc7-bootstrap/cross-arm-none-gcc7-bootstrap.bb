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

RPM_NAME = "cross-arm-none-gcc7-bootstrap-7.5.0+r278197-14.2.aarch64.rpm"
RPM_HASH = "21c18cf186238f14a25cbb01545f708dc0f4d8a9283a23462090e107ac9fb8ab10794b948b3efdd6163b494665ee1eb44a892292acac94bb9f8d0942a908cdbc"

RPROVIDES:${PN} += "arm-none-eabi-gcc \
cross-arm-none-gcc7-bootstrap \
liblto-plugin.so.0"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-arm-binutils \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
update-alternatives"

inherit rpm
