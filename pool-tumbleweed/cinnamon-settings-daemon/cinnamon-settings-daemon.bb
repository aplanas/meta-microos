SUMMARY = "The settings Daemon for the Cinnamon Desktop"
DESCRIPTION = "This package contains the settings Daemon for the Cinnamon Desktop."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only"

PV = "5.2.0"

RPM_NAME = "cinnamon-settings-daemon-5.2.0-2.8.aarch64.rpm"
RPM_HASH = "2caf372f3da1fb6e8a169058e50c5925b5e3a93c7095f2f2f30f7b87d293b7972f54bb1ca79def0d36c3cfade0bcbec809a54e53251e5125964330194b715fce"

RPROVIDES:${PN} += "cinnamon-settings-daemon \
config-cinnamon-settings-daemon \
libcsd.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXfixes.so.3 \
libXi.so.6 \
libXtst.so.6 \
libc.so.6 \
libcairo.so.2 \
libcanberra-gtk3.so.0 \
libcanberra.so.0 \
libcinnamon-desktop.so.4 \
libcolord.so.2 \
libcups.so.2 \
libcvc.so.0 \
libdbus-glib-1.so.2 \
libfontconfig.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnomekbd.so.8 \
libgnomekbdui.so.8 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgudev-1.0.so.0 \
liblcms2.so.2 \
libm.so.6 \
libnotify.so.4 \
libnspr4.so \
libnss3.so \
libpango-1.0.so.0 \
libplc4.so \
libpolkit-gobject-1.so.0 \
libpulse.so.0 \
librsvg-2.so.2 \
libsystemd.so.0 \
libupower-glib.so.3 \
libwacom.so.9 \
libxklavier.so.16"

inherit rpm
