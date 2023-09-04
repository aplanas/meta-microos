SUMMARY = "Vala programming language runtime"
DESCRIPTION = "Runtime library for the Vala programming language."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.12"

RPM_NAME = "libvala-0_56-0-0.56.12-1.1.aarch64.rpm"
RPM_HASH = "3a3aa6b538b5d78b71188d934634f1053ee2b5171c4ba96363b67fed766f7d4c3e97bb15198eed59c1a037cf3342e25b1568e6e6b09baba6c27bedc0e2ed0b2b"

RPROVIDES:${PN} += "libvala-0-56-0 \
libvala-0.56.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
