SUMMARY = "MATE Desktop control center"
DESCRIPTION = "The control center is MATE's main interface for configuration of various \
aspects of your desktop."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "mate-control-center-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "551b8f00540c82c22be2c851a2b3dba884d0db0fb5f2161ffa579e093bf6d582d9ee259d11dda9d083c726879a9ba57668b499892840ce8e1a83786911a77ec7"

RPROVIDES:${PN} += "libmarco.so \
mate-control-center"

RDEPENDS:${PN} += "gsettings-backend-dconf \
gsettings-desktop-schemas \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXcursor.so.1 \
libXi.so.6 \
libXss.so.1 \
libappindicator3.so.1 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libcanberra-gtk3.so.0 \
libcanberra.so.0 \
libdconf.so.1 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libmarco-private.so.2 \
libmate-desktop-2.so.17 \
libmate-slab.so.0 \
libmate-window-settings.so.1 \
libmatekbd.so.4 \
libmatekbdui.so.4 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpolkit-gobject-1.so.0 \
libxklavier.so.16 \
libxml2.so.2 \
mate-control-center-branding"

inherit rpm
