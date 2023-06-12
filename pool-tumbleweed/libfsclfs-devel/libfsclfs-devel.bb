SUMMARY = "Development files for libfsclfs"
DESCRIPTION = "libfsclfs is a library to access the Common Log File System (CLFS). \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfsclfs."
LICENSE = "LGPL-3.0-or-later"

PV = "20210417"

RPM_NAME = "libfsclfs-devel-20210417-3.3.aarch64.rpm"
RPM_HASH = "44855a3737a36b86b7dde65aa85fdd1251b991be1262c391c0623bf6a65648f503c15a882c69fcc55d085de7cd9bb414406dbbe62084b81b64d50b3ca7a211dd"

RPROVIDES:${PN} += "libfsclfs-devel \
libfsclfs-devel(aarch-64) \
pkgconfig(libfsclfs)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libfsclfs1"

inherit rpm
