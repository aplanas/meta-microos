SUMMARY = "UPnP/DLNA home media server for GNOME"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network. In \
technical terms, it is both a UPnP AV MediaServer and MediaRenderer \
implemented through a plug-in mechanism. It conforms to DLNA and does \
on-the-fly conversion of media to format that client devices are \
capable of handling."
LICENSE = "LGPL-2.0-or-later"

PV = "0.42.4"

RPM_NAME = "rygel-0.42.4-1.1.aarch64.rpm"
RPM_HASH = "29de0baca9346fe058c67bd9328da80104b42172a0cf217a85fbec8dfb71d5d02e6600c3c1f4ca8ed7859e40f78a7bd03dc431e0ed86c4947ed3260e41a62621"

RPROVIDES:${PN} += "config-rygel \
librygel-external.so \
librygel-gst-launch.so \
librygel-lms.so \
librygel-media-engine-gst.so \
librygel-media-engine-simple.so \
librygel-media-export.so \
librygel-mpris.so \
librygel-ruih.so \
rygel"

RDEPENDS:${PN} += "gstreamer-plugins-base \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libges-1.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgssdp-1.6.so.0 \
libgstbase-1.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgsttag-1.0.so.0 \
libgtk-3.so.0 \
libgupnp-1.6.so.0 \
libgupnp-av-1.0.so.3 \
libgupnp-dlna-2.0.so.4 \
libgupnp-dlna-gst-2.0.so.4 \
libm.so.6 \
libmediaart-2.0.so.0 \
librygel-core-2.8.so.0 \
librygel-db-2.8.so.0 \
librygel-renderer-2.8.so.0 \
librygel-ruih-2.8.so.0 \
librygel-server-2.8.so.0 \
libsoup-3.0.so.0 \
libsqlite3.so.0 \
libxml2.so.2"

inherit rpm
