SUMMARY = "Development files for libbfio, a basic file input/output abstraction library"
DESCRIPTION = "libbfio is used in multiple other libraries like libewf, libmsiecf, \
libnk2, libolecf and libpff. It is used to chain I/O to support \
file-in-file access. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libbfio."
LICENSE = "LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "libbfio-devel-20221025-2.7.aarch64.rpm"
RPM_HASH = "14f950071c322bc21fe9466fb68e3aca054101233748a0593a512d3cce10579c15164c119a3c50d39c694b9766faef2e835ca17b60cddf99a40b8cc4d3438018"

RPROVIDES:${PN} += "libbfio-devel \
pkgconfig-libbfio"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio1"

inherit rpm
