SUMMARY = "Library for Update Sequence Number (USN) Journal data types"
DESCRIPTION = "libfusn is a library for Update Sequence Number (USN) Journal data types. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20220119"

RPM_NAME = "libfusn1-20220119-4.5.aarch64.rpm"
RPM_HASH = "96f32e1d2bf6eb426914cee1b651c84c7661f8d9c65ab9f482b3a975d2d086f0f7112a40fd3d344aa843a9352921fc0d1e313f06f2500b5fa42ac5f1a8e548c5"

RPROVIDES:${PN} += "libfusn.so.1 \
libfusn1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libcerror.so.1 \
libuna.so.1"

inherit rpm
