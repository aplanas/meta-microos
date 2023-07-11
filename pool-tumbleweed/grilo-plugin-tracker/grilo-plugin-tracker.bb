SUMMARY = "Tracker plugin for the Grilo framework"
DESCRIPTION = "Grilo is a framework for browsing and searching media content from \
various sources using a single API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.16"

RPM_NAME = "grilo-plugin-tracker-0.3.16-1.2.aarch64.rpm"
RPM_HASH = "93a0af9cab85b1052f504e9f8f07d5b544cf1d5c0b570422af87ed3d8bbbd6093207985b87634289d1c4b88330b4bcfbcc2063d348c5e6b1c4a3933ebe54424e"

RPROVIDES:${PN} += "grilo-plugin-tracker \
libgrltracker3.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgrilo-0.3.so.0 \
libtracker-sparql-3.0.so.0"

inherit rpm
