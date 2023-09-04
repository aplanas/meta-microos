SUMMARY = "Application to read and manipulate raw images from digital cameras"
DESCRIPTION = "ufraw is 'The Unidentified Flying Raw'. It is an application to read and \
manipulate raw images from digital cameras. It takes care of the color \
management, handles the Nikon curve formats and has an editor for the tone \
curves. For batch processing of images, the command line can be used."
LICENSE = "GPL-2.0-or-later"

PV = "0.22"

RPM_NAME = "ufraw-0.22-12.1.aarch64.rpm"
RPM_HASH = "664d45d2d8462a17924e23e77f5f0d219a48fcb2dd8640089d6b9019bad1f5a1a03bc7c79c24769028c964183c1c6cb4787555ff33244e5101e9906b59034e53"

RPROVIDES:${PN} += "ufraw"

RDEPENDS:${PN} += "libbz2.so.1 \
libc.so.6 \
libcfitsio.so.10 \
libexiv2.so.28 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
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
