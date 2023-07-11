SUMMARY = "Library for Update Sequence Number (USN) Journal data types"
DESCRIPTION = "libfusn is a library for Update Sequence Number (USN) Journal data types. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20220119"

RPM_NAME = "libfusn1-20220119-4.4.aarch64.rpm"
RPM_HASH = "3cee83819c0b31f66f1b94c78ffbc9df27ca81429c9ad6077662585b26e854ad8765c06f7b7919f1f4861f2e6eaa11e4470e3ffd36b332d0c2cd917951b55984"

RPROVIDES:${PN} += "libfusn.so.1 \
libfusn1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libcerror.so.1 \
libuna.so.1"

inherit rpm
