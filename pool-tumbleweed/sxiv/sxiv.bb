SUMMARY = "Simple X Image Viewer"
DESCRIPTION = "sxiv is an image viewer which only has the most basic features \
for image viewing. It has vi key bindings and works with \
tiling window managers. \
 \
Features: \
- Basic image operations, e.g. zooming, panning, rotating \
- Thumbnail mode: grid of selectable previews of all images \
- Ability to cache thumbnails for fast re-loading \
- Basic support for multi-frame images \
- Loads all frames from GIF files and plays GIF animations \
- Displays image information in status bar"
LICENSE = "GPL-2.0-only"

PV = "26"

RPM_NAME = "sxiv-26-1.13.aarch64.rpm"
RPM_HASH = "e10ce87a63bb6b4d82cf0f1a95b9616559450d5642af4a15c9d82cb4678a398e1c0d3ecc3e669d1b6444d00504d1c69b928330950c35d5cc4055696bef5a1277"

RPROVIDES:${PN} += "application() \
application(sxiv.desktop) \
mimehandler(image/bmp) \
mimehandler(image/gif) \
mimehandler(image/jpeg) \
mimehandler(image/jpg) \
mimehandler(image/png) \
mimehandler(image/tiff) \
mimehandler(image/x-bmp) \
mimehandler(image/x-portable-anymap) \
mimehandler(image/x-portable-bitmap) \
mimehandler(image/x-portable-graymap) \
mimehandler(image/x-tga) \
mimehandler(image/x-xpixmap) \
sxiv \
sxiv(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
desktop-file-utils \
hicolor-icon-theme \
imlib2-loaders \
ld-linux-aarch64.so.1()(64bit) \
libImlib2.so.1()(64bit) \
libX11.so.6()(64bit) \
libXft.so.2()(64bit) \
libc.so.6()(64bit) \
libexif.so.12()(64bit) \
libfontconfig.so.1()(64bit) \
libgif.so.7()(64bit)"

inherit rpm
