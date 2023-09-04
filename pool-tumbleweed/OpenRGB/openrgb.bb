SUMMARY = "Open source RGB lighting control"
DESCRIPTION = "The purpose of this tool is to control RGB lights on different peripherals. \
Accessing the SMBus is a potentially dangerous operation, so exercise caution."
LICENSE = "GPL-2.0-only"

PV = "0.9"

RPM_NAME = "OpenRGB-0.9-1.1.aarch64.rpm"
RPM_HASH = "990964297b3bd711aa095d6b930c10abbc696c1696342af500c44e3a4158b2242920b88f91abe0096189541b1b13d066899e6506db25b4118901cfa7fcb8810f"

RPROVIDES:${PN} += "OpenRGB"

RDEPENDS:${PN} += "OpenRGB-udev-rules \
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
