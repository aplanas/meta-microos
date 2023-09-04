SUMMARY = "Shared code for the VLC media player program"
DESCRIPTION = "This subpackage contains libraries that are part of VLC."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.18"

RPM_NAME = "libvlc5-3.0.18-9.1.aarch64.rpm"
RPM_HASH = "eb4be64bd9e3a096a2654eeb20e396382b065cc6695d7cef3b31688e1e64fce7c7bda579169f3b89e5b4e1b80cc01cc300c4b8d018363414aec4f0ce7f065245"

RPROVIDES:${PN} += "libvlc.so.5 \
libvlc5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libvlccore.so.9"

inherit rpm
