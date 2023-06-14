SUMMARY = "Caja privilege granting plugin"
DESCRIPTION = "This extension allows you to open files with administration \
privileges using the context menu when browsing your files with \
Caja file manager."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "caja-extension-gksu-1.26.1-2.3.aarch64.rpm"
RPM_HASH = "702bff58180500b7cb636b7ad3693e6711679f1b29315f3e204d8fe2541a6da029de1072d3482c6e73288bd540a7e0474f5207409d7c11ebad6a5f24f8fb3835"

RPROVIDES:${PN} += "caja-extension-gksu \
caja-gksu \
libcaja-gksu.so"

RDEPENDS:${PN} += "ImageMagick \
caja \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcaja-extension.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
