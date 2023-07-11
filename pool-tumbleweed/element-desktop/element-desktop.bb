SUMMARY = "A glossy Matrix collaboration client - desktop"
DESCRIPTION = "A glossy Matrix collaboration client - desktop"
LICENSE = "Apache-2.0"

PV = "1.11.34"

RPM_NAME = "element-desktop-1.11.34-1.1.aarch64.rpm"
RPM_HASH = "d2b7f8338ab662054cb63b56fc2a1291a54af434177a0815d804f790a7e59ff9d10cd4bc5d8ee8341a1e8980db0611f31f124aac6752b3e5f61a5e28941d35db"

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
