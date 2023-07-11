SUMMARY = "Server library for the Rygel UPnP/DLNA media server"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network. \
 \
This package provides the server library of rygel."
LICENSE = "LGPL-2.0-or-later"

PV = "0.42.3"

RPM_NAME = "librygel-server-2_8-0-0.42.3-1.2.aarch64.rpm"
RPM_HASH = "819ee51b82ae5361f2496763f021a720f7f839d658bb6a54e1bec57057ce81b2542a9c266e0e80143b360ffc1a3636e2433e103dc3202f382879955880b5ce33"

RPROVIDES:${PN} += "librygel-server-2-8-0 \
librygel-server-2.8.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgssdp-1.6.so.0 \
libgupnp-1.6.so.0 \
libgupnp-av-1.0.so.3 \
libmediaart-2.0.so.0 \
librygel-core-2.8.so.0 \
libsoup-3.0.so.0 \
libxml2.so.2"

inherit rpm
