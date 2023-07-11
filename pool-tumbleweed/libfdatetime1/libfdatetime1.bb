SUMMARY = "A library for date and time data types"
DESCRIPTION = "A library for date and time data types. Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20220112"

RPM_NAME = "libfdatetime1-20220112-4.3.aarch64.rpm"
RPM_HASH = "b5c166b92f86ecb822a4d259bdd7c4216ad7b61887c1a9a81a3caedee7e0e39b657a10413671d2a51757041ecf0fb48673cff35ccbe36cc62291fec4ab3ca13b"

RPROVIDES:${PN} += "libfdatetime.so.1 \
libfdatetime1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1"

inherit rpm
