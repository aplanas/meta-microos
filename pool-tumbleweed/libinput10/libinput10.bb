SUMMARY = "Input device and event processing library"
DESCRIPTION = "libinput is a library that handles input devices for display servers and \
other applications that need to directly deal with input devices. \
 \
It provides device detection, device handling, input device event \
processing and abstraction so minimize the amount of custom input \
code the user of libinput need to provide the common set of \
functionality that users expect."
LICENSE = "MIT"

PV = "1.24.0"

RPM_NAME = "libinput10-1.24.0-1.1.aarch64.rpm"
RPM_HASH = "3e2b9203471129bd8a52dc159ece3de997b9e6db7efc8666603ac9fdd5ac2f93bcfc7af288daf43b4bd72d799c19178575081f1a5e13f479cb789d0f33915009"

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
