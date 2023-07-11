SUMMARY = "Library to read and write vcard files"
DESCRIPTION = "Library to read and write vcard files."
LICENSE = "LGPL-2.1-only"

PV = "012"

RPM_NAME = "libvc0-012-1.4.aarch64.rpm"
RPM_HASH = "3fbcddcfa930d87cb7ad3bc8377abe54b6adb56b75fab44ceafe3753cbb94e97c1c3cc416415d18a492c66ac226c5d5feca38cb8c9c5b485f024ba615436d2dc"

RPROVIDES:${PN} += "libvc.so.0 \
libvc0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
