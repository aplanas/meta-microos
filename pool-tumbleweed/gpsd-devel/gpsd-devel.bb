SUMMARY = "Client libraries in C and Python for talking to a running gpsd or GPS"
DESCRIPTION = "This package provides C header files for the gpsd shared libraries that \
manage access to a GPS for applications and debugging tools. You will \
need to have gpsd installed for it to work."
LICENSE = "BSD-3-Clause"

PV = "3.25"

RPM_NAME = "gpsd-devel-3.25-1.3.aarch64.rpm"
RPM_HASH = "0bcfad4626dce2d14cf18ebc73408069d5deb6988b9ed7d29361f6561f6f6498a9efb69abaabb8989963df3d7e023f597746a254235049ed7489072ee06aae69"

RPROVIDES:${PN} += "gpsd-devel \
pkgconfig-Qgpsmm \
pkgconfig-libgps"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
/usr/bin/python3 \
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
