SUMMARY = "The GNU Compiler Collection targeting s390x"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting s390x. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-s390x-gcc7-7.5.0+r278197-14.2.aarch64.rpm"
RPM_HASH = "3d9655a3485cbb69cb94fa1ddf7d1e4d8d0f99870aae56cebf2a5099a369a961823135f8acdfedf70a9971a09186bcc777beed0f27309e705f1e773d3801303c"

RPROVIDES:${PN} += "cross-s390x-gcc7 \
liblto-plugin.so.0"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-s390x-binutils \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
update-alternatives"

inherit rpm
