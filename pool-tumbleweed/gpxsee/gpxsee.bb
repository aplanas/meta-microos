SUMMARY = "GPS log file visualization and analysis tool"
DESCRIPTION = "GPXSee is a Qt-based tool for visualizing and analyzing GPX, TCX, FIT, KML, \
IGC, CUP, NMEA, SLF, SML, LOC, OziExplorer (PLT, RTE, WPT), Garmin GPI&CSV, \
TomTom OV2&ITN, ONmove OMD/GHP and geotagged JPEG files."
LICENSE = "GPL-3.0-only"

PV = "13.6"

RPM_NAME = "gpxsee-13.6-1.1.aarch64.rpm"
RPM_HASH = "004874b6d187be33cc3ad1104514bd08320399cb8413a2b9e543b7af72f1cfc0b08498d7d817f0895924988203462bad49a8d5029daee9ccb5756ce5559e59c0"

RPROVIDES:${PN} += "gpxsee"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libQt5Concurrent.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Positioning.so.5 \
libQt5PrintSupport.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
