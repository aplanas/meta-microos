SUMMARY = "Settings daemon for the GNOME desktop"
DESCRIPTION = "gnome-settings-daemon provides a daemon run by all GNOME sessions to \
provide live access to configuration settings and the changes done to \
them as well as basic services like a clipboard manager, controlling \
the startup of the screensaver, etc. \
 \
This module was previously part of GNOME Control Center, but has been \
split for a more general use."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only"

PV = "44.1"

RPM_NAME = "gnome-settings-daemon-44.1-2.1.aarch64.rpm"
RPM_HASH = "fd65fa29d3ed3520a8034baf3a4ae5a85209e7967f4a6f6d6151b82ac606aeccb142d75f6df7506b051f277591e3f0d9805765d42d878458f6d61e50065bbefc"

RPROVIDES:${PN} += "gnome-settings-daemon \
libgsd.so"

RDEPENDS:${PN} += "/usr/bin/pkexec \
/usr/bin/sh \
gsettings-desktop-schemas \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXfixes.so.3 \
libXi.so.6 \
libasound.so.2 \
libc.so.6 \
libcairo.so.2 \
libcanberra-gtk3.so.0 \
libcanberra.so.0 \
libcolord.so.2 \
libcups.so.2 \
libfontconfig.so.1 \
libgcr-4.so.4 \
libgdk-3.so.0 \
libgeoclue-2.so.0 \
libgeocode-glib-2.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-desktop-3.so.20 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgudev-1.0.so.0 \
libgweather-4.so.0 \
libm.so.6 \
libmm-glib.so.0 \
libnm.so.0 \
libnotify.so.4 \
libnspr4.so \
libnss3.so \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpolkit-gobject-1.so.0 \
libpulse-mainloop-glib.so.0 \
libpulse.so.0 \
libupower-glib.so.3 \
libwacom.so.9 \
libwayland-client.so.0"

inherit rpm
