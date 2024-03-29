SUMMARY = "MiniBrowser from WebKit"
DESCRIPTION = "A small test browswer from webkit, useful for testing features."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.5"

RPM_NAME = "webkit2gtk3-soup2-minibrowser-2.40.5-3.1.aarch64.rpm"
RPM_HASH = "8af4edb79b77411534d4db78911524d7b269abc553024c7fce6374ff515cd8e603a29f8f7a87d7837b6423c98660fd1832e1b23f6300ca778834e9311c22e524"

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
