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

RPM_NAME = "libgphoto2_port12-2.5.30-2.1.aarch64.rpm"
RPM_HASH = "8a7199ac7a0aeef7c5a43f97fcdd4ca61a038a914492990702b06210495acc8608359cf9919c9031635cc4cb9c800de3bd307652b0a2e25e888c8bd8766d2f82"

RPROVIDES:${PN} += "libgphoto2-port.so.12 \
libgphoto2-port12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblockdev.so.1 \
libltdl.so.7 \
libusb-1.0.so.0"

inherit rpm
