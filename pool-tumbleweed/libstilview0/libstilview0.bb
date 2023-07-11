SUMMARY = "A library to play Commodore 64 music"
DESCRIPTION = "A library to play Commodore 64 music based on libsidplay2."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.2"

RPM_NAME = "libstilview0-2.4.2-2.2.aarch64.rpm"
RPM_HASH = "a2400ffb3c245b429b9129754bf7133fd0a3a76a640b16108f5899d22cf4e2dcb593a1e41441c691d49ba9691d0ff3e5de2c4165f70af1ccce3f6087befcaa39"

RPROVIDES:${PN} += "libstilview.so.0 \
libstilview0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
