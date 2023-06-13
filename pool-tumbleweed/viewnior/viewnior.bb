SUMMARY = "An Image Viewer"
DESCRIPTION = "Viewnior is an image viewer program with a minimal interface. \
Its features are: \
 \
* Fullscreen & Slideshow \
* Rotate, flip, save, delete images \
* Animation support \
* Browse only selected images \
* Navigation window \
* Simple interface \
* Configurable mouse actions"
LICENSE = "GPL-3.0-or-later"

PV = "1.8"

RPM_NAME = "viewnior-1.8-1.6.aarch64.rpm"
RPM_HASH = "c8f24e38ea931d8415bdae0520a3e2817ddac032ca4ea7959c97553b1938efebd421e647a3f81f8bd07387f049e99df79d3d9b7a57c4cb3e7495cc518f0aaa1d"

RPROVIDES:${PN} += "application() \
application(viewnior.desktop) \
metainfo() \
metainfo(viewnior.metainfo.xml) \
mimehandler(image/bmp) \
mimehandler(image/gif) \
mimehandler(image/jpeg) \
mimehandler(image/jpg) \
mimehandler(image/pjpeg) \
mimehandler(image/png) \
mimehandler(image/svg+xml) \
mimehandler(image/svg+xml-compressed) \
mimehandler(image/tiff) \
mimehandler(image/vnd.wap.wbmp) \
mimehandler(image/x-bmp) \
mimehandler(image/x-gray) \
mimehandler(image/x-icb) \
mimehandler(image/x-ico) \
mimehandler(image/x-pcx) \
mimehandler(image/x-png) \
mimehandler(image/x-portable-anymap) \
mimehandler(image/x-portable-bitmap) \
mimehandler(image/x-portable-graymap) \
mimehandler(image/x-portable-pixmap) \
mimehandler(image/x-xbitmap) \
mimehandler(image/x-xpixmap) \
viewnior \
viewnior(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libexiv2.so.27()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
