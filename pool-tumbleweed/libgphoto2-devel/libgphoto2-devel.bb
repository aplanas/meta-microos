SUMMARY = "Development headers for libgphoto2"
DESCRIPTION = "gPhoto (GNU Photo) is a set of libraries for previewing, retrieving, \
and capturing images from a range of supported digital cameras to your \
local hard drive. \
 \
These are its development libraries and headers."
LICENSE = "LGPL-2.1-or-later"

PV = "2.5.30"

RPM_NAME = "libgphoto2-devel-2.5.30-2.1.aarch64.rpm"
RPM_HASH = "50177b4a61b39dc14d3d7309c421a1a2a479c35a2247f0dd678cc94641c370c884f590dd4ac0a7d68e0848d015e5b7ff35612dbb9a272173a4289cd006ca5d0a"

RPROVIDES:${PN} += "libgphoto2-devel \
libgphoto2-devel(aarch-64) \
pkgconfig(libgphoto2) \
pkgconfig(libgphoto2_port)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
libexif-devel \
libgphoto2-6 \
libgphoto2_port12 \
libusb-1_0-devel \
pkgconfig(libexif) \
pkgconfig(libgphoto2_port)"

inherit rpm
