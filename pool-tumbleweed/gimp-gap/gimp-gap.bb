SUMMARY = "GIMP Animation Package"
DESCRIPTION = "The GIMP-GAP (GIMP Animation Package) is a collection of Plug-Ins to \
extend the GIMP with capabilities to edit and create animations as \
sequences of single frames."
LICENSE = "GPL-2.0"

PV = "2.6.0"

RPM_NAME = "gimp-gap-2.6.0-29.33.aarch64.rpm"
RPM_HASH = "3fd4c0b9cd2b94378c041e7e8fdf2c0af75cafa7efd04d0308278599432bab17bffef390ca81878952ccd2997b1ce58dc88272da81e2921b750cab64be473768"

RPROVIDES:${PN} += "gimp-gap \
patched-build"

RDEPENDS:${PN} += "/bin/sh \
gimp-abi \
gimp-api \
gimp-gap-lang \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libgimp-2.0.so.0 \
libgimpbase-2.0.so.0 \
libgimpcolor-2.0.so.0 \
libgimpmath-2.0.so.0 \
libgimpthumb-2.0.so.0 \
libgimpui-2.0.so.0 \
libgimpwidgets-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgthread-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libm.so.6"

inherit rpm
