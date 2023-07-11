SUMMARY = "The GNU Compiler Collection targeting ppc64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting ppc64. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-ppc64-gcc7-7.5.0+r278197-14.2.aarch64.rpm"
RPM_HASH = "261a6e84b73b9015529f313b79fc1e2ac54cac2d04c77335542160c66cb77fd35327dd12d06b845e6aab99a5f530e5bd53fb7aae9a580e75a2914e8735573770"

RPROVIDES:${PN} += "cross-ppc64-gcc7 \
liblto-plugin.so.0"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-ppc64-binutils \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
update-alternatives"

inherit rpm
