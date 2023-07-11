SUMMARY = "The GNU Compiler Collection targeting epiphany"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting epiphany. \
 \
 \
 \
 \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-epiphany-gcc7-bootstrap-7.5.0+r278197-14.2.aarch64.rpm"
RPM_HASH = "5fff75a006ffae785c33e03a05d188a0d42fb891e15c9fb7d213a12196ed700827a32e9488ce0c90264f7f61f6bc22ee8e930e06a7f32fba8e1da25ee26b9dfb"

RPROVIDES:${PN} += "cross-epiphany-gcc7-bootstrap \
epiphany-elf-gcc \
liblto-plugin.so.0"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-epiphany-binutils \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
update-alternatives"

inherit rpm
