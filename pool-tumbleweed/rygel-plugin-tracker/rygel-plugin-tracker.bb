SUMMARY = "Tracker plugin for the Rygel UPnP/DLNA media server"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network. \
 \
This package provides a plugin using tracker to export media found on \
the local machine."
LICENSE = "LGPL-2.0-or-later"

PV = "0.42.3"

RPM_NAME = "rygel-plugin-tracker-0.42.3-1.2.aarch64.rpm"
RPM_HASH = "cd92aeba8754121d2e222deb94c39507447251b752367e6dc1b2ffc98c35afbcf830bd847b00ba0d2ab4115fd1b38dc7e3d5bb30f93dac43bea570ceb586a610"

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
