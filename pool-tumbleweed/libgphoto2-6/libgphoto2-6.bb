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

PV = "2.5.31"

RPM_NAME = "libgphoto2-6-2.5.31-1.1.aarch64.rpm"
RPM_HASH = "54855c8412a47115e1180960879e0416b85278de991b8d7e4fa89b1f01b1b8b6fd235394299d03d23bb826219dec0f3e5b9a3fd6781cfa30f813784a7b02e277"

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
