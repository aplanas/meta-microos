SUMMARY = "Library for on-device verification fingerprint reader support"
DESCRIPTION = "The fprint project provides a central system to support fingerprint \
readers. libfprint is the component which does the work of talking to \
fingerprint reading devices, and processing fingerprint data."
LICENSE = "LGPL-2.1-or-later"

PV = "1.94.6+tod1"

RPM_NAME = "libfprint-2-tod1-1.94.6+tod1-1.1.aarch64.rpm"
RPM_HASH = "cf45e099bf71264fd67c0b7ca55788ed5de7c877ffd09a73e1a7117a236019139c070020fcce19a8adb83303748a8b80e52ec4ab4465482c6eee440ffcaff695"

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
