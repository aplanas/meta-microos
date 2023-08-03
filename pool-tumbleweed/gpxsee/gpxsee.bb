SUMMARY = "GPS log file visualization and analysis tool"
DESCRIPTION = "GPXSee is a Qt-based tool for visualizing and analyzing GPX, TCX, FIT, KML, \
IGC, CUP, NMEA, SLF, SML, LOC, OziExplorer (PLT, RTE, WPT), Garmin GPI&CSV, \
TomTom OV2&ITN, ONmove OMD/GHP and geotagged JPEG files."
LICENSE = "GPL-3.0-only"

PV = "13.5"

RPM_NAME = "gpxsee-13.5-2.1.aarch64.rpm"
RPM_HASH = "b0cd92410f9040db5789abbed053906245cb8a6d2490919af30d581bc68b939aaea77530ff6989225f9abdccd3fd13dccdcd28fee4e4c70d9e1e9d138f7a0660"

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
