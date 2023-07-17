SUMMARY = "A Digital Camera Library"
DESCRIPTION = "gPhoto (GNU Photo) is a set of libraries for previewing, retrieving, \
and capturing images from a range of supported digital cameras to your \
local hard drive. It does not support digital cameras based on the USB \
storage protocol as those can be mounted by Linux directly. \
 \
As of this time, gPhoto supports around 1700 cameras, listed on: \
 \
https://gphoto.sourceforge.io/proj/libgphoto2/support.php \
 \
or by running \
 \
gphoto2 --list-cameras"
LICENSE = "LGPL-2.1-or-later"

PV = "2.5.30"

RPM_NAME = "libgphoto2-6-2.5.30-3.1.aarch64.rpm"
RPM_HASH = "1cd436e2ef9291bdc747daa2096b3eab8ff5bf5f70ee4f0b17da4f6d5c44d4dc2139f387c8852d89308d39c7a1e37f99e1795e9dd5287593c9664310c1f85873"

RPROVIDES:${PN} += "libgphoto2-6 \
libgphoto2.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexif.so.12 \
libgd.so.3 \
libgphoto2-port.so.12 \
libjpeg.so.8 \
libltdl.so.7 \
libm.so.6 \
libxml2.so.2 \
udev"

inherit rpm
