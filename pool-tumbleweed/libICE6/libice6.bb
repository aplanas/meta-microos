SUMMARY = "X11 Inter-Client Exchange Library"
DESCRIPTION = "The Inter-Client Exchange (ICE) protocol is intended to provide a \
framework for building such protocols, allowing them to make use of \
common negotiation mechanisms and to be multiplexed over a single \
transport connection."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "libICE6-1.1.1-1.4.aarch64.rpm"
RPM_HASH = "f0c4060690d6fa5bad61837db5a8733e04298c3c9b0c2097e6d247dfc4fa2bd8c80326c0144e4af976d462f079ec8fa0bf6ddec7d9f9bfd48ed4e16f40193e16"

RPROVIDES:${PN} += "libICE.so.6 \
libICE6 \
xorg-x11-libICE"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
