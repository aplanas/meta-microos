SUMMARY = "DLNA (dLeyna) plugin for the Grilo media framework"
DESCRIPTION = "Grilo is a framework for browsing and searching media content from \
various sources using a single API. \
 \
This package provides a plugin for accessing content from a DLNA \
(dLeyna) provider."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.16"

RPM_NAME = "grilo-plugin-dleyna-0.3.16-1.2.aarch64.rpm"
RPM_HASH = "64a94c04a722c3d81d24cafe1f39d5545a30048845fa060b5d483b9eddff496791e8d75a2b0bf3001418626a8387b24686cc7cba64555c72618b133155de108c"

RPROVIDES:${PN} += "grilo-plugin-dleyna \
grilo-plugin-upnp \
libgrldleyna.so"

RDEPENDS:${PN} += "dbus-com.intel.dleyna-server \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgrilo-0.3.so.0"

inherit rpm
