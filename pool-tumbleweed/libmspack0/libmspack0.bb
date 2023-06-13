SUMMARY = "Library That Implements Different Microsoft Compressions"
DESCRIPTION = "The purpose of libmspack is to provide both compression and \
decompression of some loosely related file formats used by Microsoft. \
Currently the most common formats are implemented."
LICENSE = "LGPL-2.1-only"

PV = "0.11"

RPM_NAME = "libmspack0-0.11-1.3.aarch64.rpm"
RPM_HASH = "364d1458de1222ca6123f8c391b28ad4aaceac216f7035696adb65b5361d8ca6a31bfa9a3bf23b6506a5a47ccd9abfc57c62ee2fc208f890d947d7b9f8bc14b2"

RPROVIDES:${PN} += "libmspack.so.0()(64bit) \
libmspack0 \
libmspack0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
