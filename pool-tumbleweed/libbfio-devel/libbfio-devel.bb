SUMMARY = "Development files for libbfio, a basic file input/output abstraction library"
DESCRIPTION = "libbfio is used in multiple other libraries like libewf, libmsiecf, \
libnk2, libolecf and libpff. It is used to chain I/O to support \
file-in-file access. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libbfio."
LICENSE = "LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "libbfio-devel-20221025-2.8.aarch64.rpm"
RPM_HASH = "0ed69052bc63260c2c26358857b2a471c7a7d2edc1aae683588c6eb3f637e99486d369b79963ded7fa798153a214528aafae20ba9824b0042cad270b1aa9f3e6"

RPROVIDES:${PN} += "libbfio-devel \
pkgconfig-libbfio"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio1"

inherit rpm
