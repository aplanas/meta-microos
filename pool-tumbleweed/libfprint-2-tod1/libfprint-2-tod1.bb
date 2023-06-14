SUMMARY = "Library for on-device verification fingerprint reader support"
DESCRIPTION = "The fprint project provides a central system to support fingerprint \
readers. libfprint is the component which does the work of talking to \
fingerprint reading devices, and processing fingerprint data."
LICENSE = "LGPL-2.1-or-later"

PV = "1.94.5+tod1"

RPM_NAME = "libfprint-2-tod1-1.94.5+tod1-1.3.aarch64.rpm"
RPM_HASH = "416386b9eb5d285b245c87f28cf5db810f74a2f04b448df70dd2d151e6a4c8413630b8d504cd7c28082ab3450097ffcaa5b123e37f04b462727a15702e39c886"

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
