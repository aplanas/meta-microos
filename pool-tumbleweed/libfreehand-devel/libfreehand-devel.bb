SUMMARY = "Files for Developing with libfreehand"
DESCRIPTION = "Libfreehand is library providing ability to interpret and import Adobe/Macromedia \
drawings into various applications. You can find it being used in libreoffice. \
 \
This package contains the libfreehand development files."
LICENSE = "MPL-2.0"

PV = "0.1.2"

RPM_NAME = "libfreehand-devel-0.1.2-2.19.aarch64.rpm"
RPM_HASH = "bea4de03206d61951904bbcd421ced7a112d1680012798f741aed3eee22d0500939c53facc8cbfbe007405af917f3046240e48a52889abac049d98c7ef1391f4"

RPROVIDES:${PN} += "libfreehand-devel \
pkgconfig-libfreehand-0.1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfreehand-0-1-1 \
pkgconfig-librevenge-0.0 \
pkgconfig-zlib"

inherit rpm
