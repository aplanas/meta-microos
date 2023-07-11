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

RPM_NAME = "libgphoto2_port12-2.5.30-2.2.aarch64.rpm"
RPM_HASH = "4479db4b950c42f746029d9095b74fd8e654e6154aefdb0b5da4dc9743596cf6522eee3a1c70368dad313d0634eb97f316870ce563f02f882a5b1e64a6319f86"

RPROVIDES:${PN} += "libgphoto2-port.so.12 \
libgphoto2-port12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblockdev.so.1 \
libltdl.so.7 \
libusb-1.0.so.0"

inherit rpm
