SUMMARY = "Library for fingerprint reader support"
DESCRIPTION = "The fprint project provides a central system to support fingerprint \
readers. libfprint is the component which does the work of talking to \
fingerprint reading devices, and processing fingerprint data."
LICENSE = "LGPL-2.1-or-later"

PV = "1.94.6+tod1"

RPM_NAME = "libfprint-2-2-1.94.6+tod1-1.1.aarch64.rpm"
RPM_HASH = "060102237069ddbdcf2a2362dda0ee6c4ae470155d5b5f3ddfc016caeaed87bfedd346e2ed63a9a92fd5cbe5d375d7095e6e69049bc1a561109c1e2e9b96e25e"

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
