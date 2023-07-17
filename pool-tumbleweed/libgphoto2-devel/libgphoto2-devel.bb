SUMMARY = "Development headers for libgphoto2"
DESCRIPTION = "gPhoto (GNU Photo) is a set of libraries for previewing, retrieving, \
and capturing images from a range of supported digital cameras to your \
local hard drive. \
 \
These are its development libraries and headers."
LICENSE = "LGPL-2.1-or-later"

PV = "2.5.30"

RPM_NAME = "libgphoto2-devel-2.5.30-3.1.aarch64.rpm"
RPM_HASH = "16b0fa0ca0c6b53dbdb564507174e8b9735f8108c0cc6a75ff27f2f6c731a279d1961cfb9f80c671e653ed160f81aea39b0ed9ceb5fc45aacdbf69339f994f92"

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
