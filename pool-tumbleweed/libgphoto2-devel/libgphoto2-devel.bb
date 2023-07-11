SUMMARY = "Development headers for libgphoto2"
DESCRIPTION = "gPhoto (GNU Photo) is a set of libraries for previewing, retrieving, \
and capturing images from a range of supported digital cameras to your \
local hard drive. \
 \
These are its development libraries and headers."
LICENSE = "LGPL-2.1-or-later"

PV = "2.5.30"

RPM_NAME = "libgphoto2-devel-2.5.30-2.2.aarch64.rpm"
RPM_HASH = "37b7309e2d9340788422fd6edbf9d6449571239e8c09c63703923b3b4b2b40f39d16794ef4ed6c89268d2ac8675661ca3104daff0c300cbf2040b25787f5a8a2"

RPROVIDES:${PN} += "libgphoto2-devel \
pkgconfig-libgphoto2 \
pkgconfig-libgphoto2-port"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libexif-devel \
libgphoto2-6 \
libgphoto2-port12 \
libusb-1-0-devel \
pkgconfig-libexif \
pkgconfig-libgphoto2-port"

inherit rpm
