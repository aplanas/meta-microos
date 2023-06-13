SUMMARY = "EFL image viewer/editor/manipulator/slideshow creator"
DESCRIPTION = "Ephoto is an image viewer and editor. \
 \
Images can be viewed one at a time, in thumbnail groups, or as a slideshow. \
In terms of editing, images can be rotated/mirrored, cropped, colors be \
adjusted and artistic filters be applied."
LICENSE = "BSD-3-Clause"

PV = "1.5"

RPM_NAME = "ephoto-1.5-1.28.aarch64.rpm"
RPM_HASH = "57f72d1bd2e22738348e2bcf17d1662683c6f86605a8869a5f13c079c6a2defd1bd19d396efa6873ba0bc1f2a20f82ef9f41759829fbc715540de89d8f01e888"

RPROVIDES:${PN} += "application() \
application(ephoto.desktop) \
ephoto \
ephoto(aarch-64) \
mimehandler(application/pdf) \
mimehandler(application/postscript) \
mimehandler(application/x-pdf) \
mimehandler(image/bmp) \
mimehandler(image/gif) \
mimehandler(image/ico) \
mimehandler(image/jpeg) \
mimehandler(image/pdf) \
mimehandler(image/pjpeg) \
mimehandler(image/png) \
mimehandler(image/svg+xml) \
mimehandler(image/svg+xml-compressed) \
mimehandler(image/tiff) \
mimehandler(image/vnd.adobe.photoshop) \
mimehandler(image/vnd.microsoft.icon) \
mimehandler(image/vnd.wap.wbmp) \
mimehandler(image/webp) \
mimehandler(image/x-bmp) \
mimehandler(image/x-compressed-xcf) \
mimehandler(image/x-ico) \
mimehandler(image/x-portable-anymap) \
mimehandler(image/x-portable-bitmap) \
mimehandler(image/x-portable-graymap) \
mimehandler(image/x-portable-pixmap) \
mimehandler(image/x-psd) \
mimehandler(image/x-tga) \
mimehandler(image/x-win-bitmap) \
mimehandler(image/x-xcf) \
mimehandler(image/x-xpixmap) \
mimehandler(inode/directory)"

RDEPENDS:${PN} += "efl \
elementary \
evas-generic-loaders \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libecore.so.1()(64bit) \
libecore_con.so.1()(64bit) \
libecore_evas.so.1()(64bit) \
libecore_file.so.1()(64bit) \
libecore_ipc.so.1()(64bit) \
libedje.so.1()(64bit) \
libeet.so.1()(64bit) \
libefreet.so.1()(64bit) \
libeina.so.1()(64bit) \
libeio.so.1()(64bit) \
libelementary.so.1()(64bit) \
libevas.so.1()(64bit) \
libm.so.6()(64bit)"

inherit rpm
