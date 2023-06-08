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

RPM_NAME = "cross-avr-gcc7-bootstrap-7.5.0+r278197-12.5.aarch64.rpm"
RPM_HASH = "a922ba57b9cbc632cbc71606f88e70f6c7ba239ff63e9a4a5d93f670c1908885c49d954a4d02c88dde3e3f4a0c5aae20dc9e59b66698a84657ed4b1a0fd99f0a"

RPROVIDES:${PN} += "cross-avr-gcc7-bootstrap cross-avr-gcc7-bootstrap(aarch-64) liblto_plugin.so.0()(64bit)"
RDEPENDS:${PN} += "/bin/sh cross-avr-binutils libc.so.6(GLIBC_2.36)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libz.so.1()(64bit) update-alternatives"

inherit rpm
