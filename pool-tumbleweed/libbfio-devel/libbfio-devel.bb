SUMMARY = "Development files for libbfio, a basic file input/output abstraction library"
DESCRIPTION = "libbfio is used in multiple other libraries like libewf, libmsiecf, \
libnk2, libolecf and libpff. It is used to chain I/O to support \
file-in-file access. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libbfio."
LICENSE = "LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "libbfio-devel-20221025-2.5.aarch64.rpm"
RPM_HASH = "7a3a8d3d73b28e1defaa7c3b2be3ba6226919a61d814b1c7db7b1ab66e818e998338a9cf9c0e5b4979d9c01ca9aeb592e2968b329e01e52bd197948ab4ea9149"

RPROVIDES:${PN} += "libbfio-devel \
libbfio-devel(aarch-64) \
pkgconfig(libbfio)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio1"

inherit rpm
