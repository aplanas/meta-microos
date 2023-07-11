SUMMARY = "X bitmap editor and converter utilities"
DESCRIPTION = "The bitmap program is a rudimentary tool for creating or editing \
rectangular images made up of 1's and 0's. Bitmaps are used in X for \
defining clipping regions, cursor shapes, icon shapes, and tile and \
stipple patterns. \
 \
The bmtoa and atobm filters convert bitmap files to and from ASCII \
strings. They are most commonly used to quickly print out bitmaps and \
to generate versions for including in text."
LICENSE = "X11"

PV = "1.1.0"

RPM_NAME = "bitmap-1.1.0-1.6.aarch64.rpm"
RPM_HASH = "bba511ba705fa6fba9b9371ee6e16718d15bcea8022bbbe97003b377a7e66feafa290e07080aa507d0a75ce2a06841d9991fc78d320f1ccdbb3a380fbd7400cd"

RPROVIDES:${PN} += "bitmap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXmu.so.6 \
libXt.so.6 \
libc.so.6 \
libm.so.6"

inherit rpm
