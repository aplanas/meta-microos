SUMMARY = "Allow session software to update device firmware"
DESCRIPTION = "fwupd is a daemon to allows session software to update device firmware on \
the local machine."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.8.17"

RPM_NAME = "libfwupd2-1.8.17-1.1.aarch64.rpm"
RPM_HASH = "46e2282eda134180ee68de2b40a3616df6c4a3ef3fef511000ad4cee42a892ae46f699a705d4815fcb5d5c26520c99a6bcec8b4e4f477777187e438541a3123f"

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
