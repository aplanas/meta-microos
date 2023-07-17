SUMMARY = "Port drivers for the libgphoto2 digital camera library"
DESCRIPTION = "gPhoto (GNU Photo) is a set of libraries for previewing, retrieving, \
and capturing images from a range of supported digital cameras to your \
local hard drive. It does not support digital cameras based on the USB \
storage protocol as those can be mounted by Linux directly. \
 \
This package contains the port drivers (e.g. the USB drivers, the PTP/IP \
driver)."
LICENSE = "LGPL-2.1-or-later"

PV = "2.5.30"

RPM_NAME = "libgphoto2_port12-2.5.30-3.1.aarch64.rpm"
RPM_HASH = "e86360b29c47ee165cf0b192ea492a4052cef84dafbb245d7381916b3b2dcb7abde2c0a7f0e3ecdc9dce3fd65293e087b96858e6467748abbfa0d2d1b011ee28"

RPROVIDES:${PN} += "libgphoto2-port.so.12 \
libgphoto2-port12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libltdl.so.7 \
libusb-1.0.so.0"

inherit rpm
