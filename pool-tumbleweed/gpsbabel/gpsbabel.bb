SUMMARY = "Converts GPS waypoint, route and track data from one format type to another"
DESCRIPTION = "GPSBabel converts waypoints, tracks, and routes from one format to \
another, whether that format is a common mapping format like Delorme, \
Streets and Trips, or even a serial upload or download to a GPS unit \
such as those from Garmin and Magellan. By flattening the Tower of \
Babel that the authors of various programs for manipulating GPS data \
have imposed upon us, it returns to us the ability to freely move our \
own waypoint data between the programs and hardware we choose to use. \
 \
It contains extensive data manipulation abilities making it a \
convenient for server-side processing or as the backend for other \
tools. \
 \
It does not convert, transfer, send, or manipulate maps. We process \
data that may (or may not be) placed on a map, such as waypoints, \
tracks, and routes."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "gpsbabel-1.8.0-1.6.aarch64.rpm"
RPM_HASH = "c7de2a13270ce85d590d7d2bf1aff58c824bd15fb71d8e6513c8ab320e941c7d928ad8631692944eaa499165fad128a6bc2ff6c7ee9376d9bd5e587e17ceb070"

RPROVIDES:${PN} += "gpsbabel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5SerialPort.so.5 \
libQt5WebChannel.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libshp.so.2 \
libstdc++.so.6 \
libusb-1.0.so.0 \
libz.so.1"

inherit rpm
