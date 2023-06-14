SUMMARY = "Samsung Mobile Device Firmware Flasher"
DESCRIPTION = "Heimdall is a tool suite used to flash firmware (aka ROMs) onto \
Samsung Mobile devices. \
 \
Official supported devices (but not limited to) are: \
 * GT-I9000 \
 * GT-I9100[T] \
 * GT-I9300 \
 * GT-I9505 \
 * SGH-I727 \
 * SGH-I777 \
 * SGH-I927 \
 * SGH-I797"
LICENSE = "MIT"

PV = "1.4.2"

RPM_NAME = "heimdall-1.4.2-1.28.aarch64.rpm"
RPM_HASH = "930ea7c20174c400689e92fdc7b9c82c08f963ba71b6bce56b5a37574a5150303d9a6dd1ff0a529d1acb4e2fd8cc5384725e8454d867079828178e5bf691aee4"

RPROVIDES:${PN} += "heimdall"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libusb-1.0.so.0"

inherit rpm
