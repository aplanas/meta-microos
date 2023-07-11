SUMMARY = "Client libraries in C and Python for talking to a running gpsd or GPS"
DESCRIPTION = "This package provides C header files for the gpsd shared libraries that \
manage access to a GPS for applications and debugging tools. You will \
need to have gpsd installed for it to work."
LICENSE = "BSD-3-Clause"

PV = "3.25"

RPM_NAME = "gpsd-devel-3.25-1.4.aarch64.rpm"
RPM_HASH = "619a6435969bd7bad5908b7d31dc981de74b199502f33760f358bb7958dc108a5348a4f0478c956dc2038032b0c0d21d5a1d1d5431863d25425ef11061f0d9ab"

RPROVIDES:${PN} += "gpsd-devel \
pkgconfig-Qgpsmm \
pkgconfig-libgps"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3 \
/usr/bin/sh \
gpsd \
ld-linux-aarch64.so.1 \
libQgpsmm30 \
libbluetooth.so.3 \
libc.so.6 \
libdbus-1.so.3 \
libgps30 \
libm.so.6 \
libusb-1.0.so.0 \
pkgconfig \
pkgconfig-Qt5Network \
python3-curses \
python3-gpsd"

inherit rpm
