SUMMARY = "Linux Key Management Utilities"
DESCRIPTION = "Utilities to control the kernel key management facility and to provide \
a mechanism by which the kernel can call back to user space to get a \
key instantiated."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.6.3"

RPM_NAME = "keyutils-1.6.3-6.1.aarch64.rpm"
RPM_HASH = "e6c2a7d352beaf76127c3d0dfa4a2088e3b487dab825ad7aaf68273edfb543645a32a1b5e9539db24dd30c0ae75b993e6dc43b1d3e114b83f563597400171672"

RPROVIDES:${PN} += "config(keyutils) \
keyutils \
keyutils(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libkeyutils.so.1()(64bit) \
libkeyutils.so.1(KEYUTILS_0.3)(64bit) \
libkeyutils.so.1(KEYUTILS_1.0)(64bit) \
libkeyutils.so.1(KEYUTILS_1.10)(64bit) \
libkeyutils.so.1(KEYUTILS_1.3)(64bit) \
libkeyutils.so.1(KEYUTILS_1.4)(64bit) \
libkeyutils.so.1(KEYUTILS_1.5)(64bit) \
libkeyutils.so.1(KEYUTILS_1.6)(64bit) \
libkeyutils.so.1(KEYUTILS_1.7)(64bit) \
libkeyutils.so.1(KEYUTILS_1.9)(64bit) \
libresolv.so.2()(64bit) \
libresolv.so.2(GLIBC_2.17)(64bit)"

inherit rpm
