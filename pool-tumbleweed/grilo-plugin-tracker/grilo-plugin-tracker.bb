SUMMARY = "Tracker plugin for the Grilo framework"
DESCRIPTION = "Grilo is a framework for browsing and searching media content from \
various sources using a single API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.16"

RPM_NAME = "grilo-plugin-tracker-0.3.16-1.1.aarch64.rpm"
RPM_HASH = "7bcde66d941931d1f7f1dc2c7997b339adf0dafa4d27458567918758c5ef51d5e33f7d34db36d6e43207b2d09c12c0ab1168b03da324bc62b15d305dbebd1f42"

RPROVIDES:${PN} += "grilo-plugin-tracker \
grilo-plugin-tracker(aarch-64) \
libgrltracker3.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgrilo-0.3.so.0()(64bit) \
libtracker-sparql-3.0.so.0()(64bit)"

inherit rpm
