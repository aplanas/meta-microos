SUMMARY = "Library for fingerprint reader support"
DESCRIPTION = "The fprint project provides a central system to support fingerprint \
readers. libfprint is the component which does the work of talking to \
fingerprint reading devices, and processing fingerprint data."
LICENSE = "LGPL-2.1-or-later"

PV = "1.94.5+tod1"

RPM_NAME = "libfprint-2-2-1.94.5+tod1-1.4.aarch64.rpm"
RPM_HASH = "018668faf6211f9b666fb1fc8a30805ad15e4b4ef725f8a2f2e05d670f174a88e4d541ef5b0c0f0a58e022729676b34c665d62599d6d1847b58cc6482d4fc109"

RPROVIDES:${PN} += "libfprint \
libfprint-2-2 \
libfprint-2.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgudev-1.0.so.0 \
libgusb.so.2 \
libm.so.6 \
libnss3.so \
libpixman-1.so.0"

inherit rpm
