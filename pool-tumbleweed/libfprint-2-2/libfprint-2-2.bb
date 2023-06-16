SUMMARY = "Library for fingerprint reader support"
DESCRIPTION = "The fprint project provides a central system to support fingerprint \
readers. libfprint is the component which does the work of talking to \
fingerprint reading devices, and processing fingerprint data."
LICENSE = "LGPL-2.1-or-later"

PV = "1.94.5+tod1"

RPM_NAME = "libfprint-2-2-1.94.5+tod1-1.3.aarch64.rpm"
RPM_HASH = "c87092b2577e833fe11682352c0591568bd0372cbb4bb46dfc1daed03f9cba5bfe540a2ab0846fa82cd3f2838ed94fe39b6a9fa375781be673d56096bd2ca7a7"

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
