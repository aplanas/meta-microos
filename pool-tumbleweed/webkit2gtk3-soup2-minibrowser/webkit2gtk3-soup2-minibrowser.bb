SUMMARY = "MiniBrowser from WebKit"
DESCRIPTION = "A small test browswer from webkit, useful for testing features."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.3"

RPM_NAME = "webkit2gtk3-soup2-minibrowser-2.40.3-2.1.aarch64.rpm"
RPM_HASH = "b6c0acd7134953b6e33689c23ae4b5bab57d6e004c2c6697a8f7038dc92f1cbb653e610965b65fe2ad23baae6af17beeea7e51386c882173c779744d28f4938a"

RPROVIDES:${PN} += "webkit2gtk3-soup2-minibrowser"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0 \
libjavascriptcoregtk-4.0.so.18 \
libsoup-2.4.so.1 \
libwebkit2gtk-4.0.so.37"

inherit rpm
