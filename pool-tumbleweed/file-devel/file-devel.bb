SUMMARY = "Development files for libmagic, a library to determine file types"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require the magic 'file' interface."
LICENSE = "BSD-2-Clause"

PV = "5.45"

RPM_NAME = "file-devel-5.45-1.1.aarch64.rpm"
RPM_HASH = "1d2188dc4ba9b141ba0a0c1151e02954a377361fe637c9220691f2fac00f3b306c1fab5192f24500b03ef17d2d9730fd6ca7996c9b7482447b5a1e1f8af530d4"

RPROVIDES:${PN} += "file-/usr/include/magic.h \
file-devel \
pkgconfig-libmagic"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libmagic1"

inherit rpm
