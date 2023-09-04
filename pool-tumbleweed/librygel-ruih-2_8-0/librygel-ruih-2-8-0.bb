SUMMARY = "Remote User Interface handling library for the Rygel UPnP/DLNA media server"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network. \
 \
This package provides the ruih library of rygel."
LICENSE = "LGPL-2.0-or-later"

PV = "0.42.4"

RPM_NAME = "librygel-ruih-2_8-0-0.42.4-1.1.aarch64.rpm"
RPM_HASH = "649e85394486f7212e941125d040497e6648f435f3a27e0f9e65cc1e25d9809cff86e40d7ed86a4f5c49b9fd10cafe5430e6589c508a5fc588705eb27b20c116"

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
