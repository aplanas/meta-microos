SUMMARY = "Library for on-device verification fingerprint reader support"
DESCRIPTION = "The fprint project provides a central system to support fingerprint \
readers. libfprint is the component which does the work of talking to \
fingerprint reading devices, and processing fingerprint data."
LICENSE = "LGPL-2.1-or-later"

PV = "1.94.5+tod1"

RPM_NAME = "libfprint-2-tod1-1.94.5+tod1-1.4.aarch64.rpm"
RPM_HASH = "67e6a7c0b9f998e702ebb642e2c9bc8b9f6bdc152913821c1564119025f89b9764229b99cb3c9e7105e6bd13f662db3f33caaa749a50702728bdf4509c5fcac6"

RPROVIDES:${PN} += "libfprint-2-tod.so.1 \
libfprint-2-tod1 \
libfprint-tod"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgusb.so.2 \
libm.so.6 \
libpixman-1.so.0"

inherit rpm
