SUMMARY = "MiniBrowser from WebKit"
DESCRIPTION = "A small test browswer from webkit, useful for testing features."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.2"

RPM_NAME = "webkit2gtk3-minibrowser-2.40.2-1.1.aarch64.rpm"
RPM_HASH = "9f1cc25c76d8a48bd72a7be11a91700c6a926845ea7cb787c3a97de57b78018be0cc4967e2362cddfe59232c243f9cd490d961a96bf7adb060c96b57d8809fe2"

RPROVIDES:${PN} += "webkit2gtk3-minibrowser"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0 \
libjavascriptcoregtk-4.1.so.0 \
libwebkit2gtk-4.1.so.0"

inherit rpm
