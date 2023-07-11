SUMMARY = "Vacuum-IM user mood plugin"
DESCRIPTION = "Vacuum-IM plugin to send and receive information about user moods."
LICENSE = "GPL-3.0-only"

PV = "0.0.1"

RPM_NAME = "vacuum-im-plugins-usermood-0.0.1-9.24.aarch64.rpm"
RPM_HASH = "3f7f91f0870a1974bea3d997bbab65c86955596180838e3c244a34b79dfed01c4b3efb746327b0cc5ad4fdb1165019187bc94b391e45bfbcb1cad68e0e501739"

RPROVIDES:${PN} += "libusermood.so \
vacuum-im-plugins-usermood"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libvacuumutils.so.37"

inherit rpm
