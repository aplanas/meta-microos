SUMMARY = "Qt 6 Multimedia library"
DESCRIPTION = "The Qt 6 Multimedia library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Multimedia6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "9e25f9ac607c295933bde4f5699914a7fc482484ea105934d83ac561fc1f3cd78b13ddc526464916858e9d97cf54e7713fb0461e661325e6092709048a4bcfc5"

RPROVIDES:${PN} += "libQt6Multimedia.so.6 \
libQt6Multimedia6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libm.so.6 \
libpulse.so.0 \
libstdc++.so.6"

inherit rpm
