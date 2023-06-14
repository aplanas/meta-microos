SUMMARY = "Development files for libmagic, a library to determine file types"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require the magic 'file' interface."
LICENSE = "BSD-2-Clause"

PV = "5.44"

RPM_NAME = "file-devel-5.44-2.1.aarch64.rpm"
RPM_HASH = "d15e9bd80425242bb9a8d32bb503f377398bca06c7e437d4ffda66eee31e56be2dc6976acb2836dfa4c0762f41bada9e3d631d703fb37c5c19ec8e5cb0e39742"

RPROVIDES:${PN} += "file-/usr/include/magic.h \
file-devel \
pkgconfig-libmagic"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libmagic1"

inherit rpm
