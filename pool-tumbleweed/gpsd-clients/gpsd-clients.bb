SUMMARY = "Example clients for gpsd"
DESCRIPTION = "xgps is a simple test client for gpsd with an X interface. It displays \
current GPS position/time/velocity information and (for GPSes that \
support the feature) the locations of accessible satellites. \
 \
xgpsspeed is a speedometer that uses position information from the GPS. \
It accepts an -h option and optional argument as for gps, or a -v \
option to dump the package version and exit. Additionally, it accepts \
-rv (reverse video) and -nc (needle color) options. \
 \
cgps resembles xgps, but without the pictorial satellite display.  It \
can run on a serial terminal or terminal emulator."
LICENSE = "BSD-3-Clause"

PV = "3.25"

RPM_NAME = "gpsd-clients-3.25-1.4.aarch64.rpm"
RPM_HASH = "05ec4827d2c59b5a1cc37235e2d67eaaf17f571b1ed80b7bd7b238a4df8d5a84d1a96284a1608828f7b9432c3c90d411cd1806cd2dd200d8c5afed41aaec4cbc"

RPROVIDES:${PN} += "gpsd-clients"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libbluetooth.so.3 \
libc.so.6 \
libdbus-1.so.3 \
libm.so.6 \
libncurses.so.6 \
libtinfo.so.6 \
libusb-1.0.so.0 \
python3-cairo \
python3-gobject \
python3-gobject-Gdk \
python3-gpsd \
python3-serial \
typelib-GLib \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gtk"

inherit rpm
