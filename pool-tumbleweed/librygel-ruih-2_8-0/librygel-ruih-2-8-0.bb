SUMMARY = "Remote User Interface handling library for the Rygel UPnP/DLNA media server"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network. \
 \
This package provides the ruih library of rygel."
LICENSE = "LGPL-2.0-or-later"

PV = "0.42.3"

RPM_NAME = "librygel-ruih-2_8-0-0.42.3-2.1.aarch64.rpm"
RPM_HASH = "b7a6393bd9953a459276ea70b6e6a8081fb5ba3f2fe298ca5c6d5b36928f723d7613c435c1e0cda766b9eef0b5ae3df05ae271938c59713c5ca797986a136da1"

RPROVIDES:${PN} += "librygel-ruih-2-8-0 \
librygel-ruih-2.8.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgupnp-1.6.so.0 \
librygel-core-2.8.so.0 \
libxml2.so.2"

inherit rpm
