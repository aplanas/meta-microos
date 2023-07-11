SUMMARY = "Render library for the Rygel UPnP/DLNA media server"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network. \
 \
This package provides the renderer library of rygel."
LICENSE = "LGPL-2.0-or-later"

PV = "0.42.3"

RPM_NAME = "librygel-renderer-2_8-0-0.42.3-1.2.aarch64.rpm"
RPM_HASH = "d20ff8530dab56994fd751e5fe4e09571fa8b98d4bf5c4f4afac39b0bf12757c0509c4f6fdf45d731576e5f1d22795a8957af3dc41bba08bd35f76a4ececad08"

RPROVIDES:${PN} += "librygel-renderer-2-8-0 \
librygel-renderer-2.8.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgupnp-1.6.so.0 \
libgupnp-av-1.0.so.3 \
librygel-core-2.8.so.0 \
libsoup-3.0.so.0"

inherit rpm
