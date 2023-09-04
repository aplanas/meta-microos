SUMMARY = "A glossy Matrix collaboration client - desktop"
DESCRIPTION = "A glossy Matrix collaboration client - desktop"
LICENSE = "Apache-2.0"

PV = "1.11.38"

RPM_NAME = "element-desktop-1.11.38-1.1.aarch64.rpm"
RPM_HASH = "0c3393032c21cba5a2b13037730a798c186b1ac5c39fe498adcf4d5fe0ef2a47149b66f1046738062f5310a137935f0b4467022c4bebeef64e6028b906db73c5"

RPROVIDES:${PN} += "config-element-desktop \
element-desktop"

RDEPENDS:${PN} += "/usr/bin/sh \
element-web \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libm.so.6 \
libsecret-1.so.0 \
libsqlcipher-3.41.2.so.0 \
libstdc++.so.6 \
nodejs-electron"

inherit rpm
