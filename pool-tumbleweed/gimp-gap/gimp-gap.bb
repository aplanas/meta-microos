SUMMARY = "GIMP Animation Package"
DESCRIPTION = "The GIMP-GAP (GIMP Animation Package) is a collection of Plug-Ins to \
extend the GIMP with capabilities to edit and create animations as \
sequences of single frames."
LICENSE = "GPL-2.0"

PV = "2.6.0"

RPM_NAME = "gimp-gap-2.6.0-29.33.aarch64.rpm"
RPM_HASH = "3fd4c0b9cd2b94378c041e7e8fdf2c0af75cafa7efd04d0308278599432bab17bffef390ca81878952ccd2997b1ce58dc88272da81e2921b750cab64be473768"

RPROVIDES:${PN} += "gimp-gap \
gimp-gap(aarch-64) \
patched_build"

RDEPENDS:${PN} += "/bin/sh \
gimp(abi) \
gimp(api) \
gimp-gap-lang \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgimp-2.0.so.0()(64bit) \
libgimpbase-2.0.so.0()(64bit) \
libgimpcolor-2.0.so.0()(64bit) \
libgimpmath-2.0.so.0()(64bit) \
libgimpthumb-2.0.so.0()(64bit) \
libgimpui-2.0.so.0()(64bit) \
libgimpwidgets-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgthread-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libm.so.6()(64bit)"

inherit rpm
