SUMMARY = "Core library for the Rygel UPnP/DLNA media server"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network. \
 \
This package provides the core library of rygel."
LICENSE = "LGPL-2.0-or-later"

PV = "0.42.3"

RPM_NAME = "librygel-core-2_8-0-0.42.3-1.1.aarch64.rpm"
RPM_HASH = "c5018e2b3e76bb816fff4e07fe4d94f99765c679989bd4c5c971dd718989ae7d94a74a728502896d72195752d170c2af9feedcd61910d561572591b72e5ec3c9"

RPROVIDES:${PN} += "librygel-core-2-8-0 \
librygel-core-2.8.so.0"

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
libxml2.so.2"

inherit rpm
