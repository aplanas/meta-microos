SUMMARY = "The GNU Compiler Collection targeting arm-none"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting arm-none."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-arm-none-gcc7-7.5.0+r278197-14.2.aarch64.rpm"
RPM_HASH = "e61768d128083e3f217f813fb39aabf8748bba770b31bb0883d92959779e080eca5e2cd501a8c1a3fd36807fb72d23ecd6a384da9f7a169933dfb8514695762d"

RPROVIDES:${PN} += "arm-none-eabi-gcc \
cross-arm-none-gcc7 \
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
