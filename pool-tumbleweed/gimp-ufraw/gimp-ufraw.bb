SUMMARY = "Raw photo loader plugin for The GIMP"
DESCRIPTION = "UFRaw is a utility to read and manipulate raw images from digital \
cameras. It can be used as a GIMP plug-in. It reads raw images using \
Dave Coffin's raw conversion utility DCRaw, and it supports basic color \
management using Little CMS, allowing the user to apply color profiles."
LICENSE = "GPL-2.0-or-later"

PV = "0.22"

RPM_NAME = "gimp-ufraw-0.22-12.1.aarch64.rpm"
RPM_HASH = "f44f26a8301752e14bd5d39bff0dad45435feabbffcc818843aab405860c7f9dd39c1612797d942ae19a52fa6162a6b94403505099ffb9723d41c81fd78a48ee"

RPROVIDES:${PN} += "gimp-2.0-dcraw-plugin \
gimp-ufraw \
rawphoto \
ufraw-gimp"

RDEPENDS:${PN} += "gimp-abi \
gimp-api \
libbz2.so.1 \
libc.so.6 \
libcfitsio.so.10 \
libexiv2.so.28 \
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
