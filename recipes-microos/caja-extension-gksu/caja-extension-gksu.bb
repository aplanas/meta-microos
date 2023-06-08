SUMMARY = "Caja privilege granting plugin"
DESCRIPTION = "This extension allows you to open files with administration \
privileges using the context menu when browsing your files with \
Caja file manager."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "caja-extension-gksu-1.26.1-2.3.aarch64.rpm"
RPM_HASH = "702bff58180500b7cb636b7ad3693e6711679f1b29315f3e204d8fe2541a6da029de1072d3482c6e73288bd540a7e0474f5207409d7c11ebad6a5f24f8fb3835"

RPROVIDES:${PN} += "caja-extension-gksu caja-extension-gksu(aarch-64) caja-gksu libcaja-gksu.so()(64bit)"
RDEPENDS:${PN} += "ImageMagick caja ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcaja-extension.so.1()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit)"

inherit rpm
