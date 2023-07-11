SUMMARY = "Russian Character Set Conversion Library"
DESCRIPTION = "Provides the possibility to automatically convert considered \
encodings to and from UTF-8. A lot of languages are supported, not \
just the Russian one. The library is part of the rusxmms patch."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.13"

RPM_NAME = "librcc0-0.2.13-1.4.aarch64.rpm"
RPM_HASH = "2689910cbf9dfefb005370ed168e34dfcbea3e69b5395aadcf05f6264562e6187dfe9ced57e80a692e1a00a13e89e6db3ddb22b1a123e50678641b59307b28e2"

RPROVIDES:${PN} += "librcc.so.0 \
librcc0 \
librccui.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaspell.so.15 \
libc.so.6 \
libdb-4.8.so \
libenca.so.0 \
librcd.so.0 \
libxml2.so.2 \
rcc-runtime"

inherit rpm
