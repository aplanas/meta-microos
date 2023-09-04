SUMMARY = "Development files for libphdi"
DESCRIPTION = "libphdi is a library to access the Parallels Hard Disk image format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libphdi."
LICENSE = "LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "libphdi-devel-20221025-4.1.aarch64.rpm"
RPM_HASH = "f632aa794c7ce847addb35567aba4dc361e1f2412967be75d1c275863f8c24bb585d378413ccbe332008c70a83be100575df72ac0e3682c613319483b9d1a59e"

RPROVIDES:${PN} += "libphdi-devel \
pkgconfig-libphdi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libphdi1"

inherit rpm
