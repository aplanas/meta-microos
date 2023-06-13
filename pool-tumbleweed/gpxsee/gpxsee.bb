SUMMARY = "GPS log file visualization and analysis tool"
DESCRIPTION = "GPXSee is a Qt-based tool for visualizing and analyzing GPX, TCX, FIT, KML, \
IGC, CUP, NMEA, SLF, SML, LOC, OziExplorer (PLT, RTE, WPT), Garmin GPI&CSV, \
TomTom OV2&ITN, ONmove OMD/GHP and geotagged JPEG files."
LICENSE = "GPL-3.0-only"

PV = "13.3"

RPM_NAME = "gpxsee-13.3-1.1.aarch64.rpm"
RPM_HASH = "f466be29ec2ee1abcf821feb21e12cfa65d43bc2e0ddf53477f5ae0c96567155fc69547cdecfa1fdeaec0350275675adafb48c00c034551e9c4ad24069690bb9"

RPROVIDES:${PN} += "application() \
application(gpxsee.desktop) \
gpxsee \
gpxsee(aarch-64) \
mimehandler(application/geo+json) \
mimehandler(application/gpx+xml) \
mimehandler(application/vnd.alpinequest.aqm) \
mimehandler(application/vnd.ant.fit) \
mimehandler(application/vnd.cgtk.gemf) \
mimehandler(application/vnd.esri.wld) \
mimehandler(application/vnd.fai.igc) \
mimehandler(application/vnd.garmin.gmap+xml) \
mimehandler(application/vnd.garmin.gpi) \
mimehandler(application/vnd.garmin.img) \
mimehandler(application/vnd.garmin.jnx) \
mimehandler(application/vnd.garmin.tcx+xml) \
mimehandler(application/vnd.google-earth.kml+xml) \
mimehandler(application/vnd.google-earth.kmz) \
mimehandler(application/vnd.gpxsee.map+xml) \
mimehandler(application/vnd.groundspeak.loc+xml) \
mimehandler(application/vnd.iho.s57) \
mimehandler(application/vnd.mapbox.mbtiles) \
mimehandler(application/vnd.mapsforge.map) \
mimehandler(application/vnd.memory-map.qct) \
mimehandler(application/vnd.naviter.seeyou.cup) \
mimehandler(application/vnd.nmea.nmea) \
mimehandler(application/vnd.onmove.ghp) \
mimehandler(application/vnd.onmove.omd) \
mimehandler(application/vnd.orux.map+xml) \
mimehandler(application/vnd.osmdroid.sqlite) \
mimehandler(application/vnd.oziexplorer.map) \
mimehandler(application/vnd.oziexplorer.plt) \
mimehandler(application/vnd.oziexplorer.rte) \
mimehandler(application/vnd.oziexplorer.wpt) \
mimehandler(application/vnd.rmaps.sqlite) \
mimehandler(application/vnd.sigma.slf+xml) \
mimehandler(application/vnd.suunto.sml+xml) \
mimehandler(application/vnd.tomtom.itn) \
mimehandler(application/vnd.tomtom.ov2) \
mimehandler(application/vnd.trekbuddy.tba) \
mimehandler(application/vnd.twonav.rmap) \
mimehandler(application/vnd.twonav.rte) \
mimehandler(application/vnd.twonav.trk) \
mimehandler(application/vnd.twonav.wpt) \
mimehandler(application/x-tar) \
mimehandler(image/jpeg) \
mimehandler(image/tiff) \
mimehandler(image/vnd.maptech.kap) \
mimehandler(text/csv)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libQt5Concurrent.so.5()(64bit) \
libQt5Concurrent.so.5(Qt_5)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Positioning.so.5()(64bit) \
libQt5Positioning.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Sql.so.5()(64bit) \
libQt5Sql.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
