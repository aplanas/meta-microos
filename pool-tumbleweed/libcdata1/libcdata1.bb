SUMMARY = "Library for C generic data functions"
DESCRIPTION = "A library for C generic data functions. \
 \
This subpackage contains the actual shared object library"
LICENSE = "LGPL-3.0-or-later"

PV = "20230108"

RPM_NAME = "libcdata1-20230108-1.3.aarch64.rpm"
RPM_HASH = "b28b28cfab9a19d2c47790d259922098165d01a206a9cef72c59b7fe749647b1cd1f2c0c0a6f1f922eba7c989d783b5867f415fb8266ecd39ba74cce8d0bb74c"

RPROVIDES:${PN} += "libcdata.so.1 \
libcdata1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1"

inherit rpm
