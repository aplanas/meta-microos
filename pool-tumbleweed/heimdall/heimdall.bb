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

RPM_NAME = "heimdall-1.4.2-1.29.aarch64.rpm"
RPM_HASH = "8e5b175207d6ae7191009396812430ffd2b3d01bd9c90ffe3a42a157f89d5a830e42efb546d23751da40abe0a905a5618a2c50a2133bf5b825ac46c70c13306c"

RPROVIDES:${PN} += "heimdall"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libusb-1.0.so.0"

inherit rpm
