SUMMARY = "GIMP Animation Package"
DESCRIPTION = "The GIMP-GAP (GIMP Animation Package) is a collection of Plug-Ins to \
extend the GIMP with capabilities to edit and create animations as \
sequences of single frames."
LICENSE = "GPL-2.0"

PV = "2.6.0"

RPM_NAME = "gimp-gap-2.6.0-29.34.aarch64.rpm"
RPM_HASH = "e7ec10ad05575ed0fc7123ff7efdf0c5aa9886e8521f16261ce613d4fdb0c750d4406699ed2c11cd3df638a0ec19c1107caf041804d11d852b6c17965fbc2897"

RPROVIDES:${PN} += "gimp-gap \
patched-build"

RDEPENDS:${PN} += "/usr/bin/sh \
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
