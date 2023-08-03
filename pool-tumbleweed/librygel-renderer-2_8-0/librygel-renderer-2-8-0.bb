SUMMARY = "Render library for the Rygel UPnP/DLNA media server"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network. \
 \
This package provides the renderer library of rygel."
LICENSE = "LGPL-2.0-or-later"

PV = "0.42.3"

RPM_NAME = "librygel-renderer-2_8-0-0.42.3-2.1.aarch64.rpm"
RPM_HASH = "66b01f7daf96e5fbe91985fec03e71218d1b4d6f4ea8a9741316ed1d3b601bf53cdbbf885d657c1a3debd96eedd04f28aff7d10c9529b7872d7ad533b17017c6"

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
