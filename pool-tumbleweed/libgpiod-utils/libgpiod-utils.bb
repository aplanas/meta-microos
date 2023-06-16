SUMMARY = "Tools for interacting with the linux GPIO character device"
DESCRIPTION = "The libgpiod library encapsulates the ioctl calls and data structures \
of the GPIO character devices, the latter of which superseded the \
GPIO sysfs interface in Linux 4.8. \
 \
Command-line tools part."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.3"

RPM_NAME = "libgpiod-utils-1.6.3-2.3.aarch64.rpm"
RPM_HASH = "63e4530a63abb7917a71b4e9fd928e4d528b8b670561688207d8c901640d6746f6e186f272918e1e9f940502890b7409a34b53ab52b9b1702e0d8ac2a49e3dbd"

RPROVIDES:${PN} += "libgpiod \
libgpiod-utils"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/bats \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgpiod.so.2 \
libgpiodcxx.so.1 \
libgpiomockup.so.0 \
libstdc++.so.6"

inherit rpm
