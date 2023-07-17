SUMMARY = "Development files for libfmapi, a library for MAPI data types"
DESCRIPTION = "A library for MAPI data types. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfmapi."
LICENSE = "LGPL-3.0-or-later"

PV = "20230408"

RPM_NAME = "libfmapi-devel-20230408-1.4.aarch64.rpm"
RPM_HASH = "b05a9f0b9dd773184b5c95404de268e50df19c941eddf19a5d67cfc0df1f2e4eb14c11d379fec1253fdd8d7bdd3b42d324731d9792a544bbfd8fde917d801f07"

RPROVIDES:${PN} += "libfmapi-devel \
pkgconfig-libfmapi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfmapi1"

inherit rpm
