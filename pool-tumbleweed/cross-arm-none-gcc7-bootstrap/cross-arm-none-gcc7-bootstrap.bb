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
cross-arm-none-gcc7-bootstrap(aarch-64) \
liblto_plugin.so.0()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
cross-arm-binutils \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libmpc.so.3()(64bit) \
libmpfr.so.6()(64bit) \
libz.so.1()(64bit) \
update-alternatives"

inherit rpm
