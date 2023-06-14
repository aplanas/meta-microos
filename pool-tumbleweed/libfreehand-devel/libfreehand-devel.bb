SUMMARY = "Files for Developing with libfreehand"
DESCRIPTION = "Libfreehand is library providing ability to interpret and import Adobe/Macromedia \
drawings into various applications. You can find it being used in libreoffice. \
 \
This package contains the libfreehand development files."
LICENSE = "MPL-2.0"

PV = "0.1.2"

RPM_NAME = "libfreehand-devel-0.1.2-2.18.aarch64.rpm"
RPM_HASH = "51975e2314991e2587c84fb5645a6d354d0d3e3eab324be33eefb1c0efdec508ca1327447c8dfcb11d4edbce27dfbaddb5a8472943f4a89b0b149821b35cf1ce"

RPROVIDES:${PN} += "libfreehand-devel \
pkgconfig-libfreehand-0.1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfreehand-0-1-1 \
pkgconfig-librevenge-0.0 \
pkgconfig-zlib"

inherit rpm
