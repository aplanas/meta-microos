SUMMARY = "Library for C notify functions"
DESCRIPTION = "A library for C notify functions."
LICENSE = "LGPL-3.0-or-later"

PV = "20220108"

RPM_NAME = "libcnotify1-20220108-3.3.aarch64.rpm"
RPM_HASH = "bec3a98fef7e2d616f74a22413eee5c36602e89c1c0ed3b05169923eb18de89a72b50f44944026b9c285ce4bbd4d76b92769e4d927e444e54a7305cb67462e06"

RPROVIDES:${PN} += "libcnotify.so.1 \
libcnotify1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1"

inherit rpm
