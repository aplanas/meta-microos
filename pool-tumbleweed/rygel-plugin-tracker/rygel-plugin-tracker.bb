SUMMARY = "Tracker plugin for the Rygel UPnP/DLNA media server"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network. \
 \
This package provides a plugin using tracker to export media found on \
the local machine."
LICENSE = "LGPL-2.0-or-later"

PV = "0.42.3"

RPM_NAME = "rygel-plugin-tracker-0.42.3-1.1.aarch64.rpm"
RPM_HASH = "088d35446ece101e3d9b7e1eaf2d50acedb53ab4610450b9c12fe010f013cf72ceadf5cedbbaaf03f86ecae19b0c18cd58454d9b65b06d43c8d3c43c375637ea"

RPROVIDES:${PN} += "librygel-tracker3.so \
rygel-plugin-tracker"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
librygel-core-2.8.so.0 \
librygel-server-2.8.so.0 \
libtracker-sparql-3.0.so.0 \
rygel \
tracker"

inherit rpm
