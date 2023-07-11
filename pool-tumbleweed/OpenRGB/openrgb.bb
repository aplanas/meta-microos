SUMMARY = "Open source RGB lighting control"
DESCRIPTION = "The purpose of this tool is to control RGB lights on different peripherals. \
Accessing the SMBus is a potentially dangerous operation, so exercise caution."
LICENSE = "GPL-2.0-only"

PV = "0.8"

RPM_NAME = "OpenRGB-0.8-2.1.aarch64.rpm"
RPM_HASH = "061d41bebe7b46ff27a5dedc192407227814a4c8a282586ccb6cec745c795d7e79f50b418ace5d0d7a4f2cacb3624e7efce1e4327f0e83a0135279f8bf28931d"

RPROVIDES:${PN} += "OpenRGB"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libe131.so.1 \
libgcc-s.so.1 \
libhidapi-hidraw.so.0 \
libm.so.6 \
libmbedcrypto.so.14 \
libmbedtls.so.19 \
libmbedx509.so.5 \
libstdc++.so.6 \
libusb-1.0.so.0"

inherit rpm
