SUMMARY = "Development files for the X Window System Cursor library"
DESCRIPTION = "Xcursor a library designed to help locate and load cursors. Cursors \
can be loaded from files or memory. A library of common cursors \
exists which map to the standard X cursor names.Cursors can exist in \
several sizes and the library automatically picks the best size. \
 \
This package contains the development headers for the library found \
in libXcursor1."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "libXcursor-devel-1.2.1-1.6.aarch64.rpm"
RPM_HASH = "561bab6b029e86893f790ecc132e450ce4a7354d620600f815e990b6231ec74d1090156086aad881c049cc56a95be5ef8db29a33c34fad1bd4366b25f8601b3b"

RPROVIDES:${PN} += "libXcursor-devel \
pkgconfig-xcursor"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXcursor1 \
pkgconfig-x11 \
pkgconfig-xfixes \
pkgconfig-xproto \
pkgconfig-xrender"

inherit rpm
