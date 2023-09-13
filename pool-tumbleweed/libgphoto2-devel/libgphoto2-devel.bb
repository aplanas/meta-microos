SUMMARY = "Development headers for libgphoto2"
DESCRIPTION = "gPhoto (GNU Photo) is a set of libraries for previewing, retrieving, \
and capturing images from a range of supported digital cameras to your \
local hard drive. \
 \
These are its development libraries and headers."
LICENSE = "LGPL-2.1-or-later"

PV = "2.5.31"

RPM_NAME = "libgphoto2-devel-2.5.31-1.1.aarch64.rpm"
RPM_HASH = "33b4a4dfe9b682ebcd62f4b359aa5c9155afa0aada04f8876a27d5124772461c03e1637c0791b80afa1705e8ac11f87fdd70ee61d15e2bb11b45a61811fa1de2"

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
