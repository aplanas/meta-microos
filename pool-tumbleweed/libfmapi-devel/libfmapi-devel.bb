SUMMARY = "Development files for libfmapi, a library for MAPI data types"
DESCRIPTION = "A library for MAPI data types. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfmapi."
LICENSE = "LGPL-3.0-or-later"

PV = "20230408"

RPM_NAME = "libfmapi-devel-20230408-1.1.aarch64.rpm"
RPM_HASH = "df6a63d62a051ed5b471ca4c86cc664647b500401767ea2b6b23f5ac0d9cfeddc65428fc364081503ade34a09ad70b77f2a5087d8f6995ed920e9a00a9352995"

RPROVIDES:${PN} += "libfmapi-devel \
libfmapi-devel(aarch-64) \
pkgconfig(libfmapi)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfmapi1"

inherit rpm
