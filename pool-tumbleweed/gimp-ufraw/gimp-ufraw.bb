SUMMARY = "Raw photo loader plugin for The GIMP"
DESCRIPTION = "UFRaw is a utility to read and manipulate raw images from digital \
cameras. It can be used as a GIMP plug-in. It reads raw images using \
Dave Coffin's raw conversion utility DCRaw, and it supports basic color \
management using Little CMS, allowing the user to apply color profiles."
LICENSE = "GPL-2.0-or-later"

PV = "0.22"

RPM_NAME = "gimp-ufraw-0.22-11.8.aarch64.rpm"
RPM_HASH = "7dd63c0eac189e0c85b9137d93e17a9692e91a282d2a55aefcd6424c57920462a77711af017847814ac857234df06049db654a91bcc8eaf9ff239deb7b834fff"

RPROVIDES:${PN} += "gimp-2.0-dcraw-plugin \
gimp-ufraw \
rawphoto \
ufraw-gimp"

RDEPENDS:${PN} += "gimp-abi \
gimp-api \
libbz2.so.1 \
libc.so.6 \
libcfitsio.so.10 \
libexiv2.so.27 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libgegl-0.4.so.0 \
libgimp-2.0.so.0 \
libgimpbase-2.0.so.0 \
libgimpui-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgomp.so.1 \
libgtk-x11-2.0.so.0 \
libgtkimageview.so.0 \
libjpeg.so.8 \
liblcms2.so.2 \
liblensfun.so.1 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libtiff.so.6 \
libz.so.1"

inherit rpm
