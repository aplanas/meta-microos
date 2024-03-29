SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "cross-rx-binutils-2.40-5.1.aarch64.rpm"
RPM_HASH = "6e03cad29e1b570f467a983273077058d81cfb4daf3e0a1b0d52850be6dbf02e745a168ba821d32cedb568ca999d754d92aafa6b5f889ed4dddb9e95da47edb3"

RPROVIDES:${PN} += "cross-rx-binutils"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
libzstd.so.1 \
update-alternatives"

inherit rpm
