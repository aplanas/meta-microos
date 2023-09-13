SUMMARY = "Port drivers for the libgphoto2 digital camera library"
DESCRIPTION = "gPhoto (GNU Photo) is a set of libraries for previewing, retrieving, \
and capturing images from a range of supported digital cameras to your \
local hard drive. It does not support digital cameras based on the USB \
storage protocol as those can be mounted by Linux directly. \
 \
This package contains the port drivers (e.g. the USB drivers, the PTP/IP \
driver)."
LICENSE = "LGPL-2.1-or-later"

PV = "2.5.31"

RPM_NAME = "libgphoto2_port12-2.5.31-1.1.aarch64.rpm"
RPM_HASH = "b02431b4c0e2ff45f165159022bd9442a55240c6ec2a8870f582066d8fe2574275bff4ada27b2153bbd8c0958c9ed0c94bcb89df155ba7e8a6674229fe85a715"

RPROVIDES:${PN} += "libgphoto2-port.so.12 \
libgphoto2-port12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libltdl.so.7 \
libusb-1.0.so.0"

inherit rpm
