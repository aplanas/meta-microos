SUMMARY = "Tracker plugin for the Rygel UPnP/DLNA media server"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network. \
 \
This package provides a plugin using tracker to export media found on \
the local machine."
LICENSE = "LGPL-2.0-or-later"

PV = "0.42.3"

RPM_NAME = "rygel-plugin-tracker-0.42.3-2.1.aarch64.rpm"
RPM_HASH = "172cd96d910fe2d84a790b3baf7c4c5c97140df9adccfd76a0dcc9d48d0c33535ac680f3425456a19e4c4b5bcb3380495b93c87d9e82e5b8d9852417d5812a75"

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
