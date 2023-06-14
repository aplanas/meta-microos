SUMMARY = "MATE Desktop Panel"
DESCRIPTION = "This package contains the MATE Desktop Panel. The panel is an \
interface to manage the desktop, launch applications, and organise \
access to data."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.3"

RPM_NAME = "mate-panel-1.26.3-1.1.aarch64.rpm"
RPM_HASH = "67c932ec7f7ca0576752f81526c6719efdac8a270f40ff13030618b2451c86ab622e08c2e71820dd558b00a434248aed9b177ed8bcd6b2c2dec3c52696fe5ec0"

RPROVIDES:${PN} += "mate-panel"

RDEPENDS:${PN} += "gsettings-backend-dconf \
gvfs-backends \
ld-linux-aarch64.so.1 \
libICE.so.6 \
libSM.so.6 \
libX11.so.6 \
libXrandr.so.2 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libmate-desktop-2.so.17 \
libmate-menu.so.2 \
libmate-panel-applet-4.so.1 \
libmateweather.so.1 \
libpango-1.0.so.0 \
libwnck-3.so.0"

inherit rpm
