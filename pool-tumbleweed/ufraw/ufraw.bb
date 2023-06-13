SUMMARY = "Application to read and manipulate raw images from digital cameras"
DESCRIPTION = "ufraw is 'The Unidentified Flying Raw'. It is an application to read and \
manipulate raw images from digital cameras. It takes care of the color \
management, handles the Nikon curve formats and has an editor for the tone \
curves. For batch processing of images, the command line can be used."
LICENSE = "GPL-2.0-or-later"

PV = "0.22"

RPM_NAME = "ufraw-0.22-11.8.aarch64.rpm"
RPM_HASH = "a6164d793a72319c7e73751bf68822b1db8f22faad75cb64ec18acf6f5c1c0fa7772f7caedb1d5b6cbcfba816672047e978980dd4057a935d60fbde848bf7609"

RPROVIDES:${PN} += "application() \
application(ufraw.desktop) \
mimehandler(application/x-ufraw) \
mimehandler(image/x-dcraw) \
ufraw \
ufraw(aarch-64)"

RDEPENDS:${PN} += "libbz2.so.1()(64bit) \
libc.so.6()(64bit) \
libcfitsio.so.10()(64bit) \
libexiv2.so.27()(64bit) \
libgcc_s.so.1()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgomp.so.1()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libgtkimageview.so.0()(64bit) \
libjpeg.so.8()(64bit) \
liblcms2.so.2()(64bit) \
liblensfun.so.1()(64bit) \
libm.so.6()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libstdc++.so.6()(64bit) \
libtiff.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
