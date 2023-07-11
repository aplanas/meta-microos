SUMMARY = "Remote User Interface handling library for the Rygel UPnP/DLNA media server"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network. \
 \
This package provides the ruih library of rygel."
LICENSE = "LGPL-2.0-or-later"

PV = "0.42.3"

RPM_NAME = "librygel-ruih-2_8-0-0.42.3-1.2.aarch64.rpm"
RPM_HASH = "3dd73caf0d39c2547522deaf2da6819f9b0dda86539c981c7b920f6ebf34fbb0ccc044847f45ebe3008b9d233f9092f7a1bf81f1bd50c79446c98a590c10263b"

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
