SUMMARY = "GPS log file visualization and analysis tool"
DESCRIPTION = "GPXSee is a Qt-based tool for visualizing and analyzing GPX, TCX, FIT, KML, \
IGC, CUP, NMEA, SLF, SML, LOC, OziExplorer (PLT, RTE, WPT), Garmin GPI&CSV, \
TomTom OV2&ITN, ONmove OMD/GHP and geotagged JPEG files."
LICENSE = "GPL-3.0-only"

PV = "13.3"

RPM_NAME = "gpxsee-13.3-1.1.aarch64.rpm"
RPM_HASH = "f466be29ec2ee1abcf821feb21e12cfa65d43bc2e0ddf53477f5ae0c96567155fc69547cdecfa1fdeaec0350275675adafb48c00c034551e9c4ad24069690bb9"

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
