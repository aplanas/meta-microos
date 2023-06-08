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

RPM_NAME = "bitmap-1.1.0-1.5.aarch64.rpm"
RPM_HASH = "d110da01131df4a13c40b2d796d2829cd0988b485b76689b66ad3c692d5efaf506d88d57377e6ce33cbea5715b20cbe55902326fd4dd9a37d2122faaecdecd5a"

RPROVIDES:${PN} += "bitmap bitmap(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXaw.so.7()(64bit) libXmu.so.6()(64bit) libXt.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
