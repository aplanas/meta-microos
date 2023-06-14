SUMMARY = "Qt-based ups monitor (front-end for upsc from Network UPS Tools)"
DESCRIPTION = "upsm is Qt-based ups monitor (front-end for upsc from Network UPS Tools). \
It sits at the tray and polls nut server using upsc, so you need to set \
up NUT first."
LICENSE = "SUSE-Public-Domain"

PV = "3.0.0"

RPM_NAME = "upsm-3.0.0-2.1.aarch64.rpm"
RPM_HASH = "296f341da69f33f1b7ec85c534c962b9da5981d2086a17299f7e3e8129d4f0fb3a1f1e972a39360db15f0abbfddabd9077e5c782a17eb811d01b06d878b74c09"

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
