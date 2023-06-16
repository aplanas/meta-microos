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

RPM_NAME = "cross-arm-none-gcc7-bootstrap-7.5.0+r278197-14.1.aarch64.rpm"
RPM_HASH = "5ffbbc645e1092dbb46ecf843552ca788e66a14c334a67dda426129ec275f01dd018b811e35f35367c0601baaa21a8eb11c8303edb47e650a232b92f91ed6c87"

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
