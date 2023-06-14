SUMMARY = "Russian Character Set Conversion Library"
DESCRIPTION = "Provides the possibility to automatically convert considered \
encodings to and from UTF-8. A lot of languages are supported, not \
just the Russian one. The library is part of the rusxmms patch."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.13"

RPM_NAME = "librcc0-0.2.13-1.3.aarch64.rpm"
RPM_HASH = "d9eea637ba9e39ec552e3960cd20424ac7870b64b7db4fb23f69b4e8add61802982a42cc2d6b70dd00c8feb6f700fb366d377ae88fa23ea96b18941c8202d2d5"

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
