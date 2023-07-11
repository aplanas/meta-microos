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

RPM_NAME = "sxiv-26-1.14.aarch64.rpm"
RPM_HASH = "6cb2192a054d87f9287104db5763615061a6316e42529dbcd50b714e9a861ff3d7e4c86ef4ab9ca70f648256c41fcf7f7d8d46112b35afc79b396a520e59297b"

RPROVIDES:${PN} += "sxiv"

RDEPENDS:${PN} += "/usr/bin/sh \
desktop-file-utils \
hicolor-icon-theme \
imlib2-loaders \
ld-linux-aarch64.so.1 \
libImlib2.so.1 \
libX11.so.6 \
libXft.so.2 \
libc.so.6 \
libexif.so.12 \
libfontconfig.so.1 \
libgif.so.7"

inherit rpm
