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

RPM_NAME = "gpsd-clients-3.25-1.3.aarch64.rpm"
RPM_HASH = "bd6cfe5f20b5267ad964516dd64f685b9abf4e8d5cb67153c564dbae37cb24d883adea747caa92f9f2b92caa11f763ffca10de2de0902811633b7b6bd01b0db0"

RPROVIDES:${PN} += "application() \
application(xgps.desktop) \
application(xgpsspeed.desktop) \
gpsd-clients \
gpsd-clients(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbluetooth.so.3()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libncurses.so.6()(64bit) \
libncurses.so.6(NCURSEST6_5.7.20081102)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) \
libusb-1.0.so.0()(64bit) \
python3-cairo \
python3-gobject \
python3-gobject-Gdk \
python3-gpsd \
python3-serial \
typelib(GLib) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(Gtk)"

inherit rpm
