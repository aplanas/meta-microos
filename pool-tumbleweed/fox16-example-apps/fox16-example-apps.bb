SUMMARY = "Example applications for the FOX GUI toolkit"
DESCRIPTION = "The example-apps package contains executables for several FOX-based \
applications, including: \
 \
* Adie : Programmer's Text Editor \
 \
* calculator : Calculator Applet \
 \
* shutterbug : Screenshot Utility \
 \
* PathFinder : File Browser"
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.57"

RPM_NAME = "fox16-example-apps-1.6.57-4.2.aarch64.rpm"
RPM_HASH = "6bc81f96e41d1446fdcc69d507b2f52b011c2357b56eecef7eb4f94cf5398e0397773c0d08bd18ddfe2f3ada3e167dff49546184c6ef4e6de0ae87504147c7ba"

RPROVIDES:${PN} += "fox-example-apps \
fox16-example-apps"

RDEPENDS:${PN} += "libFOX-1.6.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
