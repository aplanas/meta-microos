SUMMARY = "A set of applets for the MATE Desktop"
DESCRIPTION = "This package provides a set of applets to use with the MATE panel."
LICENSE = "GFDL-1.1-only & GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "mate-applets-1.26.1-1.5.aarch64.rpm"
RPM_HASH = "52eba638fecb3fabc83f2df22860f8a0d1d80cd9dfc76c23af1b77f7b97674845d92d8b9cb61653924b5a74ae199632414b558006bd1c06f4923774abf87a9a1"

RPROVIDES:${PN} += "config-mate-applets \
mate-applet-netspeed \
mate-applets \
mate-netspeed"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtop-2.0.so.11 \
libgucharmap-2-90.so.7 \
libm.so.6 \
libmate-panel-applet-4.so.1 \
libmateweather.so.1 \
libnl-3.so.200 \
libnl-genl-3.so.200 \
libnotify.so.4 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libupower-glib.so.3 \
libwnck-3.so.0 \
libxml2.so.2"

inherit rpm
