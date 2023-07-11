SUMMARY = "Service daemon for mediating access to a GPS"
DESCRIPTION = "gpsd is a service daemon that mediates access to a GPS sensor connected \
to the host computer by serial or USB interface, making its data on the \
location/course/velocity of the sensor available to be queried on TCP \
port 2947 of the host computer.  With gpsd, multiple GPS client \
applications (such as navigational and wardriving software) can share \
access to a GPS without contention or loss of data.  Also, gpsd \
responds to queries with a format that is substantially easier to parse \
than NMEA 0183.  A client library is provided for applications. \
 \
After installing this RPM, gpsd will automatically connect to USB GPSes \
when they are plugged in and requires no configuration.  For serial \
GPSes, you will need to start gpsd by hand.  Once connected, the daemon \
automatically discovers the correct baudrate, stop bits, and protocol. \
The daemon will be quiescent when there are no clients asking for \
location information, and copes gracefully when the GPS is unplugged \
and replugged."
LICENSE = "BSD-3-Clause"

PV = "3.25"

RPM_NAME = "gpsd-3.25-1.4.aarch64.rpm"
RPM_HASH = "86b1db6563bb595853cdf5dd5d73b668f2a81680e1b4366bc22d0e0a20edf39fc086696d86a96125895b2b13e7c2a6e2290dd53c0edd886ecdf27f4de9dfd403"

RPROVIDES:${PN} += "gpsd"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
coreutils \
fillup \
ld-linux-aarch64.so.1 \
libbluetooth.so.3 \
libc.so.6 \
libdbus-1.so.3 \
libm.so.6 \
libusb-1.0.so.0 \
systemd \
udev"

inherit rpm
