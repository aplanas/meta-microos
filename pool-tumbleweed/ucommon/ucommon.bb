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

RPM_NAME = "ucommon-7.0.1-1.9.aarch64.rpm"
RPM_HASH = "cde670eea9e88e575018e3071845f33c8908d965f006477a5b6972913b7a68cbd7cdfdf99f24171bc0b8d307100ed2a3458322d4935538cac3c0ffad36164417"

RPROVIDES:${PN} += "ucommon \
ucommon(aarch-64) \
ucommon-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libucommon.so.8()(64bit) \
libusecure.so.8()(64bit)"

inherit rpm
