SUMMARY = "Library to access storage media devices"
DESCRIPTION = "libsmdev is a library to access and read storage media devices."
LICENSE = "LGPL-3.0-or-later"

PV = "20221028"

RPM_NAME = "libsmdev1-20221028-2.8.aarch64.rpm"
RPM_HASH = "4576bbb8f402830fff575d664b2fd7552bc40ad9b62b96362b4b3a1636345f60b946dcbcba3a090f9a8d796fa7182eff867b817020d2bc94cedc019ac9b91e0b"

RPROVIDES:${PN} += "libsmdev.so.1 \
libsmdev1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libcfile.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libuna.so.1"

inherit rpm
