SUMMARY = "Development files for libcdatetime, a PFF/OFF file format library"
DESCRIPTION = "libcdatetime is a library C date and time functions. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libcdatetime."
LICENSE = "LGPL-3.0-or-later"

PV = "20230115"

RPM_NAME = "libcdatetime-devel-20230115-1.3.aarch64.rpm"
RPM_HASH = "1f602bf4618a704e8cd69fd014b26cbc0a08f75ae37601ecdd8a78d5a7bf68da6cbddb4e89f7f821b0ae0a5067215dcd7c5956b6142046d7eaa4eb716e6b6185"

RPROVIDES:${PN} += "libcdatetime-devel \
pkgconfig-libcdatetime"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcdatetime1"

inherit rpm
