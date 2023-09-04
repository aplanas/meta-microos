SUMMARY = "Tracker plugin for the Rygel UPnP/DLNA media server"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network. \
 \
This package provides a plugin using tracker to export media found on \
the local machine."
LICENSE = "LGPL-2.0-or-later"

PV = "0.42.4"

RPM_NAME = "rygel-plugin-tracker-0.42.4-1.1.aarch64.rpm"
RPM_HASH = "d59e6af4b3380ba47d794448bc603d2a980cc6ac02ebf5b9c4763c0b4af243c528bd30086b9ee271bc0507f6139b66e210dbded1d21bb5cd6f7aaee3c76a7614"

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
