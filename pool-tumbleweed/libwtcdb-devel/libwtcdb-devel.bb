SUMMARY = "Development files for libwtcdb"
DESCRIPTION = "libwtcdb is a library to access the Windows (Vista/7) Explorer \
thumbnail cache database (WTCDB) format (thumbcache.db). \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libwtcdb."
LICENSE = "LGPL-3.0-or-later"

PV = "20210417"

RPM_NAME = "libwtcdb-devel-20210417-3.4.aarch64.rpm"
RPM_HASH = "90efbe3c83dfc88eac16acf112fd0accfa13ee3af2910a321e276c98ecec76c96b674e209b82a717b9afd7a77e01e94bc5ce477c09da7d67e287ad3e3c43b034"

RPROVIDES:${PN} += "libwtcdb-devel \
pkgconfig-libwtcdb"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libwtcdb1"

inherit rpm
