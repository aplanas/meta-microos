SUMMARY = "Library to access storage media devices"
DESCRIPTION = "libsmdev is a library to access and read storage media devices."
LICENSE = "LGPL-3.0-or-later"

PV = "20221028"

RPM_NAME = "libsmdev1-20221028-2.11.aarch64.rpm"
RPM_HASH = "9cbb64f400e53b135a5c27df79d8c84029a4db8d85742ce8fcb492404fcf05be6fae03a3dc6d6a639427450a4229134aabadae263d1f9b0206d0255c91b759ea"

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
