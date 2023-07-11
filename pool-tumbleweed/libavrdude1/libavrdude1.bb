SUMMARY = "Shared library of avrdude"
DESCRIPTION = "This package contains the shared libavrdude library."
LICENSE = "GPL-2.0-or-later"

PV = "7.1"

RPM_NAME = "libavrdude1-7.1-1.1.aarch64.rpm"
RPM_HASH = "15f231c42f252571e370bbd43423bb3d9654c735383692e511630a7d47cf72b0acb153509821eb0115952105c232a2a7aaf24e75c1c5a3731f20ec4eeafe34e4"

RPROVIDES:${PN} += "libavrdude.so.1 \
libavrdude1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libelf.so.1 \
libftdi1.so.2 \
libhidapi-libusb.so.0 \
libm.so.6 \
libusb-0.1.so.4 \
libusb-1.0.so.0"

inherit rpm
