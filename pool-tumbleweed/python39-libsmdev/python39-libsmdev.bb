SUMMARY = "Library to access storage media devices"
DESCRIPTION = "libsmdev is a library to access and read storage media devices."
LICENSE = "LGPL-3.0-or-later"

PV = "20221028"

RPM_NAME = "python39-libsmdev-20221028-2.8.aarch64.rpm"
RPM_HASH = "a03e03350f497447ce28f75550296b9b3fb0e10bb71877a47370f9ef70ed807e6428793312d9beb8ad2abad7f1549b9bfed77952f3c20b612f269c9e14b76646"

RPROVIDES:${PN} += "python39-libsmdev"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libsmdev.so.1 \
python-abi"

inherit rpm
