SUMMARY = "MiniBrowser from WebKit"
DESCRIPTION = "A small test browswer from webkit, useful for testing features and \
embedded mini browsers."
LICENSE = "BSD-3-Clause & LGPL-2.1"

PV = "2.40.3"

RPM_NAME = "wpewebkit-minibrowser-2.40.3-1.2.aarch64.rpm"
RPM_HASH = "621d20597e16f20a5b24fe3e37fd7dcef98c37c8da948e5e962191f7fb0f8ac0faab648b8e8395e1f27277238a1b2373c10212cce20e5c7d44145d9f41b5b5de"

RPROVIDES:${PN} += "wpewebkit-minibrowser"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libWPEBackend-fdo-1.0.so.1 \
libWPEWebKit-2-0-1 \
libWPEWebKit-2.0.so.1 \
libatk-1.0.so.0 \
libatk-bridge-2.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libepoxy.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libstdc++.so.6 \
libwayland-client.so.0 \
libwayland-egl.so.1 \
libwayland-server.so.0 \
libwpe-1.0.so.1 \
libxkbcommon.so.0"

inherit rpm
