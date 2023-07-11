SUMMARY = "Development files for libmapidb, a library for accessing the Exchange MAPI database format"
DESCRIPTION = "A library for accessing the Exchange MAPI database format \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libmapidb."
LICENSE = "LGPL-3.0-or-later"

PV = "20210421"

RPM_NAME = "libmapidb-devel-20210421-2.4.aarch64.rpm"
RPM_HASH = "2415e150c34d08872ee076860243756dc2b7a2dff956f8710c7d5cdd175fe04bd354fe19c06f5cde79737fe260889ef8132c35b40e8ce39ec50aff6687c12632"

RPROVIDES:${PN} += "libmapidb-devel \
pkgconfig-libmapidb"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmapidb1"

inherit rpm
