SUMMARY = "MATE Desktop graphics viewer"
DESCRIPTION = "The Eye of MATE is a graphics viewer for the MATE Desktop \
which uses the gdk-pixbuf library. It can deal with large images, \
and zoom and scroll with constant memory usage."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.26.1"

RPM_NAME = "eom-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "3d1994c9768f19405b50908d615e066fef96c05d428552322a9e6fcc1ba1944ab14b17393e33240a624f8e69961d613a4de4ba871c4f67249261a0497cb461b0"

RPROVIDES:${PN} += "application() \
application(eom.desktop) \
eom \
eom(aarch-64) \
libfullscreen.so()(64bit) \
libreload.so()(64bit) \
libstatusbar-date.so()(64bit) \
mate-image-viewer \
metainfo() \
metainfo(eom.appdata.xml) \
mimehandler(application/ico) \
mimehandler(application/x-navi-animation) \
mimehandler(audio/x-riff) \
mimehandler(image/bmp) \
mimehandler(image/gif) \
mimehandler(image/ico) \
mimehandler(image/icon) \
mimehandler(image/jp2) \
mimehandler(image/jpeg) \
mimehandler(image/jpeg2000) \
mimehandler(image/jpg) \
mimehandler(image/jpx) \
mimehandler(image/pjpeg) \
mimehandler(image/png) \
mimehandler(image/qtif) \
mimehandler(image/svg) \
mimehandler(image/svg+xml) \
mimehandler(image/svg+xml-compressed) \
mimehandler(image/svg-xml) \
mimehandler(image/tiff) \
mimehandler(image/vnd.adobe.svg+xml) \
mimehandler(image/vnd.microsoft.icon) \
mimehandler(image/vnd.wap.wbmp) \
mimehandler(image/webp) \
mimehandler(image/x-MS-bmp) \
mimehandler(image/x-adobe-dng) \
mimehandler(image/x-bmp) \
mimehandler(image/x-canon-cr2) \
mimehandler(image/x-canon-crw) \
mimehandler(image/x-compressed-xcf) \
mimehandler(image/x-epson-erf) \
mimehandler(image/x-fuji-raf) \
mimehandler(image/x-gray) \
mimehandler(image/x-icb) \
mimehandler(image/x-icns) \
mimehandler(image/x-ico) \
mimehandler(image/x-icon) \
mimehandler(image/x-minolta-mrw) \
mimehandler(image/x-nikon-nef) \
mimehandler(image/x-olympus-orf) \
mimehandler(image/x-pcx) \
mimehandler(image/x-pentax-pef) \
mimehandler(image/x-png) \
mimehandler(image/x-portable-anymap) \
mimehandler(image/x-portable-bitmap) \
mimehandler(image/x-portable-graymap) \
mimehandler(image/x-portable-pixmap) \
mimehandler(image/x-quicktime) \
mimehandler(image/x-sony-arw) \
mimehandler(image/x-tga) \
mimehandler(image/x-win-bitmap) \
mimehandler(image/x-wmf) \
mimehandler(image/x-xbitmap) \
mimehandler(image/x-xcf) \
mimehandler(image/x-xpixmap) \
mimehandler(text/ico) \
mimehandler(text/xml-svg)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libexempi.so.8()(64bit) \
libexif.so.12()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libgirepository-1.0.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
liblcms2.so.2()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmate-desktop-2.so.17()(64bit) \
libpeas-1.0.so.0()(64bit) \
libpeas-gtk-1.0.so.0()(64bit) \
librsvg-2.so.2()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libz.so.1()(64bit) \
mate-desktop-gsettings-schemas"

inherit rpm