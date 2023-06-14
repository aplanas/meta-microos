SUMMARY = "Save for Web plug-in for The Gimp"
DESCRIPTION = "Save for Web allows to find compromise between minimal file size and \
acceptable quality of image quickly. While adjusting various settings, \
you may explore how image and file size change. Options to decrease \
image file size include setting quality, number or colors, resizing, \
cropping, Exif information removal, etc."
LICENSE = "GPL-2.0+"

PV = "0.29.3"

RPM_NAME = "gimp-save-for-web-0.29.3-13.31.aarch64.rpm"
RPM_HASH = "3e1e224ac8725bb583ac4b085a6ff4b004aa9771b344de88380e6084ed746f7ee750c1e450d2c992c8fb1abc3eacc9fe3affc7ce00a65c962813971fe45649b0"

RPROVIDES:${PN} += "gimp-save-for-web"

RDEPENDS:${PN} += "gimp-abi \
gimp-api \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libgimp-2.0.so.0 \
libgimpbase-2.0.so.0 \
libgimpui-2.0.so.0 \
libgimpwidgets-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
