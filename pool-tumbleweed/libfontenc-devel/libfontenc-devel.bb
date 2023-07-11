SUMMARY = "Development files for the X11 font encoding library"
DESCRIPTION = "The libfontenc library is used by the Xorg server and other X font \
tools for handling fonts with different character set encodings. \
 \
This package contains the development headers for the library found \
in libfontenc1."
LICENSE = "MIT"

PV = "1.1.7"

RPM_NAME = "libfontenc-devel-1.1.7-1.3.aarch64.rpm"
RPM_HASH = "73c14ae493643280f98bd5e32839e649910ad11d144d446c9f3b6ca2086469954678c3c430738d13b7d859f0dec79ac96cc9ccb7d43caf25d8cf8c8be70c4047"

RPROVIDES:${PN} += "libfontenc-devel \
pkgconfig-fontenc \
xorg-x11-libfontenc-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfontenc1"

inherit rpm
