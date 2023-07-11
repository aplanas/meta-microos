SUMMARY = "Input device and event processing library"
DESCRIPTION = "libinput is a library that handles input devices for display servers and \
other applications that need to directly deal with input devices. \
 \
It provides device detection, device handling, input device event \
processing and abstraction so minimize the amount of custom input \
code the user of libinput need to provide the common set of \
functionality that users expect."
LICENSE = "MIT"

PV = "1.23.0"

RPM_NAME = "libinput10-1.23.0-1.2.aarch64.rpm"
RPM_HASH = "545e7f8b998360c8d2253d7e12056805215ad9d25818e1625385f5346ec9807c3e528a804a73ef9cea186c78464baf170eaffe4a1ccb4a335be614cac1d84ec1"

RPROVIDES:${PN} += "libinput.so.10 \
libinput10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libevdev.so.2 \
libm.so.6 \
libmtdev.so.1 \
libudev.so.1 \
libwacom.so.9"

inherit rpm
