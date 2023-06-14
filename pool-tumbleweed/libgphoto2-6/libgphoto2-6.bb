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

RPM_NAME = "libgphoto2-6-2.5.30-2.1.aarch64.rpm"
RPM_HASH = "27e84ab1e5851252ef04e4051374cb3e74b51216488b0e57389e9e23aafdd5e0765f4a3e05823906ce9a31c5fa6c7340c0afef41ec55c09d8a69d95026c66791"

RPROVIDES:${PN} += "libgphoto2-6 \
libgphoto2.so.6"

RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
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
