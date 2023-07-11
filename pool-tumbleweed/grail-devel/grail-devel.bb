SUMMARY = "Development files for gesture recognition library"
DESCRIPTION = "Development files for the gesture recognition library (grail). \
The library handles tentative getures, i.e., buffering of events \
for several alternative gestures until a match is confirmed."
LICENSE = "LGPL-3.0 & GPL-3.0"

PV = "3.1.1"

RPM_NAME = "grail-devel-3.1.1-1.23.aarch64.rpm"
RPM_HASH = "ee969df3a459c21a091b2577232a6ad95f0721464518076a4190734dc5e3d3a82066514f4a3cea82a255ac5c99d3240e14df32e2b04fe86039bb6a9fe000a638"

RPROVIDES:${PN} += "grail-devel \
pkgconfig-grail"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
grail \
libgrail6"

inherit rpm
