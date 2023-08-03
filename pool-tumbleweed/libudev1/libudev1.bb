SUMMARY = "Dynamic library to access udev device information"
DESCRIPTION = "This package contains the dynamic library libudev, which provides \
access to udev device information"
LICENSE = "LGPL-2.1-or-later"

PV = "253.7"

RPM_NAME = "libudev1-253.7-2.1.aarch64.rpm"
RPM_HASH = "8f2879825899c6b988a158a81bac706d0e7c1008dd938df5111b9a61906e0f4120032499d6e2c6035ed772524a7e3a94b95ee6c68e75a1e1d739228acf631678"

RPROVIDES:${PN} += "libudev.so.1 \
libudev1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2"

inherit rpm
