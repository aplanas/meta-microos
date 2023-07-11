SUMMARY = "Library for C date and time functions"
DESCRIPTION = "Library for C date and time functions. \
 \
libcdatetime is a low level member of the libyal library family."
LICENSE = "LGPL-3.0-or-later"

PV = "20230115"

RPM_NAME = "libcdatetime1-20230115-1.3.aarch64.rpm"
RPM_HASH = "7c0e83dfa4fd2382f782e983a41d3adaae2190b2f598eb8bde8a4fa4d13b7a967ebe1eda524e1451f8b1617df7f1c64e4112e77ba0cfc145cde3b61eb65b7ed6"

RPROVIDES:${PN} += "libcdatetime.so.1 \
libcdatetime1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1"

inherit rpm
