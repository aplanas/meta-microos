SUMMARY = "Allow session software to update device firmware"
DESCRIPTION = "fwupd is a daemon to allows session software to update device firmware on \
the local machine."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.8.12"

RPM_NAME = "libfwupd2-1.8.12-1.3.aarch64.rpm"
RPM_HASH = "0f05b3daa108a5542b3792fc487947aa2c0c3431a01049ef743405711d88fa1b767b08bb0e3b4395645c596e47e37e1da4e1de9624ceccebd1170967b33ebd9c"

RPROVIDES:${PN} += "libfwupd.so.2 \
libfwupd2"

RDEPENDS:${PN} += "/sbin/ldconfig \
fwupd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libjcat.so.1 \
libjson-glib-1.0.so.0"

inherit rpm
