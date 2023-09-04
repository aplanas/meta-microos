SUMMARY = "Support library for poke"
DESCRIPTION = "Contains support library for poke."
LICENSE = "GPL-3.0-or-later"

PV = "3.3"

RPM_NAME = "libpoke0-3.3-1.1.aarch64.rpm"
RPM_HASH = "9cc7324a951aef5a018039384e8ed09dcba77d41095de31a77aaf922406f5918fec279d43cf81662bef4f2d566ee96054121d28668cad534862eb38dd0d71814"

RPROVIDES:${PN} += "libpoke.so.0 \
libpoke0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgc.so.1 \
libnbd.so.0"

inherit rpm
