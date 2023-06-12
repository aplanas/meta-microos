SUMMARY = "Server library for the Rygel UPnP/DLNA media server"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network. \
 \
This package provides the server library of rygel."
LICENSE = "LGPL-2.0-or-later"

PV = "0.42.3"

RPM_NAME = "librygel-server-2_8-0-0.42.3-1.1.aarch64.rpm"
RPM_HASH = "5cb7a16dcba9b054772117eebf92ebed7ccd52325a0ad23be00c862a61f5f0ab565c2fab3b96d13e1a9074d87972a31e7393afab10af8aeaee055443c13b64e4"

RPROVIDES:${PN} += "librygel-server-2.8.so.0()(64bit) \
librygel-server-2_8-0 \
librygel-server-2_8-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgee-0.8.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgssdp-1.6.so.0()(64bit) \
libgupnp-1.6.so.0()(64bit) \
libgupnp-av-1.0.so.3()(64bit) \
libmediaart-2.0.so.0()(64bit) \
librygel-core-2.8.so.0()(64bit) \
libsoup-3.0.so.0()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit)"

inherit rpm
