SUMMARY = "Application to read and manipulate raw images from digital cameras"
DESCRIPTION = "ufraw is 'The Unidentified Flying Raw'. It is an application to read and \
manipulate raw images from digital cameras. It takes care of the color \
management, handles the Nikon curve formats and has an editor for the tone \
curves. For batch processing of images, the command line can be used."
LICENSE = "GPL-2.0-or-later"

PV = "0.22"

RPM_NAME = "ufraw-0.22-11.8.aarch64.rpm"
RPM_HASH = "a6164d793a72319c7e73751bf68822b1db8f22faad75cb64ec18acf6f5c1c0fa7772f7caedb1d5b6cbcfba816672047e978980dd4057a935d60fbde848bf7609"

RPROVIDES:${PN} += "ufraw"

RDEPENDS:${PN} += "libbz2.so.1 \
libc.so.6 \
libcfitsio.so.10 \
libexiv2.so.27 \
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
