SUMMARY = "Shared libraries for the Cinnamon configuration utilities"
DESCRIPTION = "This package provides shared libraries used by Cinnamon control \
centre applets."
LICENSE = "GPL-2.0-only & GPL-3.0-or-later & MIT"

PV = "5.8.0"

RPM_NAME = "libcinnamon-control-center1-5.8.0-1.1.aarch64.rpm"
RPM_HASH = "a0d997d7b8cc117f01e367d9d103e9fbf5cc78f7b03afcd01ba3f7b6ca3f50b2c1cb8459c60c182e404f1e84e7df34d36aeaf9964dc7e303d8c55c1104c67e5c"

RPROVIDES:${PN} += "libcinnamon-control-center.so.1 \
libcinnamon-control-center1 \
libcolor.so \
libdisplay.so \
libnetwork.so \
libonline-accounts.so \
libregion.so \
libwacom-properties.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXi.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libcinnamon-desktop.so.4 \
libcolord.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnomekbd.so.8 \
libgnomekbdui.so.8 \
libgoa-1.0.so.0 \
libgoa-backend-1.0.so.1 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgudev-1.0.so.0 \
libm.so.6 \
libmm-glib.so.0 \
libnm.so.0 \
libnma.so.0 \
libpango-1.0.so.0 \
libpolkit-gobject-1.so.0 \
libupower-glib.so.3 \
libwacom.so.9 \
libxklavier.so.16"

inherit rpm
