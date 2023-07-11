SUMMARY = "MiniBrowser from WebKit"
DESCRIPTION = "A small test browswer from webkit, useful for testing features."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.3"

RPM_NAME = "webkit2gtk3-soup2-minibrowser-2.40.3-1.1.aarch64.rpm"
RPM_HASH = "53540dba6338d117f79f4088bfd5b9ca2fb4ed0c6ea58a315bb717100d6f952bb97def6a5ff908b80f8882d52d097652caa8bf343c6516b224ff5865ba8b72bf"

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
