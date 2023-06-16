SUMMARY = "The GNU Compiler Collection targeting sparcv9"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting sparcv9. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-sparc-gcc7-7.5.0+r278197-14.1.aarch64.rpm"
RPM_HASH = "2a8e4fae27653421732ccbc30f94a12f90761d52e3b765208b20f4cd2f10853dfbc57ab1d5b7fadcd341da1a3d95bc3ee0a06a0d3ffef3c6548c5c38e85de29c"

RPROVIDES:${PN} += "cross-sparc-gcc7 \
liblto-plugin.so.0"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-sparc-binutils \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
update-alternatives"

inherit rpm
