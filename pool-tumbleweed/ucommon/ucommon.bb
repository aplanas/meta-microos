SUMMARY = "Runtime library for portable C++ threading and sockets"
DESCRIPTION = "GNU uCommon C++ is a lightweight library to facilitate using C++ \
design patterns even for very deeply embedded applications, such as \
for systems using uClibc along with POSIX threading support. \
 \
This subpackage contains a collection of command line tools that use \
various aspects of the ucommon library. Some may be needed to prepare \
files or for development of applications."
LICENSE = "LGPL-3.0-or-later"

PV = "7.0.1"

RPM_NAME = "ucommon-7.0.1-1.10.aarch64.rpm"
RPM_HASH = "daf7a61161fc6ab5eb01a17efede968776e5081a17098448ca5916defd1b769104cb2d73d6c5c5ff007c6c1feb52d4ac14acf44135ecd1745b074fc891adcf15"

RPROVIDES:${PN} += "ucommon \
ucommon-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libucommon.so.8 \
libusecure.so.8"

inherit rpm
