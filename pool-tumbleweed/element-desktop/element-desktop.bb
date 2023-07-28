SUMMARY = "A glossy Matrix collaboration client - desktop"
DESCRIPTION = "A glossy Matrix collaboration client - desktop"
LICENSE = "Apache-2.0"

PV = "1.11.36"

RPM_NAME = "element-desktop-1.11.36-1.1.aarch64.rpm"
RPM_HASH = "616f5e908ca3e56c79d496506fb02f7265ef3d3c0d907be3bb57d61f5377ef0a85dbb0aa352c5273fd40a3af64ec72a32472c5ced696b469a0013a39f08d4e07"

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
