SUMMARY = "USB hub per-port power control"
DESCRIPTION = "uhubctl is utility to control USB power per-port on smart USB hubs. \
Smart hub is defined as one that implements per-port power switching."
LICENSE = "GPL-2.0-only"

PV = "2.5.0"

RPM_NAME = "uhubctl-2.5.0-1.2.aarch64.rpm"
RPM_HASH = "f59f97ba02564d7813d023226c89ad7e3c65253083818ad7381d67f7ed23ca55e27b3dda67e734c36cf03b14c4a0fa6b6f209b83e12d571e820cb564233a7c3a"

RPROVIDES:${PN} += "uhubctl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0"

inherit rpm
