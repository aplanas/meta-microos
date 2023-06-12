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

RPROVIDES:${PN} += "libgphoto2_port.so.12()(64bit) \
libgphoto2_port.so.12(LIBGPHOTO2_5_0)(64bit) \
libgphoto2_port.so.12(LIBGPHOTO2_INTERNAL)(64bit) \
libgphoto2_port12 \
libgphoto2_port12(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
liblockdev.so.1()(64bit) \
libltdl.so.7()(64bit) \
libusb-1.0.so.0()(64bit)"

inherit rpm
