SUMMARY = "UPnP/DLNA home media server for GNOME"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network. In \
technical terms, it is both a UPnP AV MediaServer and MediaRenderer \
implemented through a plug-in mechanism. It conforms to DLNA and does \
on-the-fly conversion of media to format that client devices are \
capable of handling."
LICENSE = "LGPL-2.0-or-later"

PV = "0.42.3"

RPM_NAME = "rygel-0.42.3-1.1.aarch64.rpm"
RPM_HASH = "c5118fbc7f03e0c45e31a4ad1b9f5b21ae1e6eca1ac35ff9ed454074d8fcd3197a56219a79aca9e6eb37879286e40f6316bfb826cadc5f5991bf1d3b66fbca2a"

RPROVIDES:${PN} += "application() \
application(rygel-preferences.desktop) \
application(rygel.desktop) \
config(rygel) \
librygel-external.so()(64bit) \
librygel-gst-launch.so()(64bit) \
librygel-lms.so()(64bit) \
librygel-media-engine-gst.so()(64bit) \
librygel-media-engine-simple.so()(64bit) \
librygel-media-export.so()(64bit) \
librygel-mpris.so()(64bit) \
librygel-ruih.so()(64bit) \
rygel \
rygel(aarch-64)"
RDEPENDS:${PN} += "gstreamer-plugins-base \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgee-0.8.so.2()(64bit) \
libges-1.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgssdp-1.6.so.0()(64bit) \
libgstbase-1.0.so.0()(64bit) \
libgstpbutils-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgsttag-1.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgupnp-1.6.so.0()(64bit) \
libgupnp-av-1.0.so.3()(64bit) \
libgupnp-dlna-2.0.so.4()(64bit) \
libgupnp-dlna-gst-2.0.so.4()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libmediaart-2.0.so.0()(64bit) \
librygel-core-2.8.so.0()(64bit) \
librygel-db-2.8.so.0()(64bit) \
librygel-renderer-2.8.so.0()(64bit) \
librygel-ruih-2.8.so.0()(64bit) \
librygel-server-2.8.so.0()(64bit) \
libsoup-3.0.so.0()(64bit) \
libsqlite3.so.0()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit)"

inherit rpm
