SUMMARY = "Qt-based ups monitor (front-end for upsc from Network UPS Tools)"
DESCRIPTION = "upsm is Qt-based ups monitor (front-end for upsc from Network UPS Tools). \
It sits at the tray and polls nut server using upsc, so you need to set \
up NUT first."
LICENSE = "SUSE-Public-Domain"

PV = "3.0.0"

RPM_NAME = "upsm-3.0.0-2.2.aarch64.rpm"
RPM_HASH = "27c62a9ed0de7d33e417e87fa5c91ea240c9145bc35cd0e37c4d727bed85c9025219414da23adaf2b3ecbce17006133a56168afa8a19b935bf1bbf9022ca3616"

RPROVIDES:${PN} += "upsm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
nut"

inherit rpm
