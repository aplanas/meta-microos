SUMMARY = "Development files for libtracefs"
DESCRIPTION = "This library provides C APIs to access the kernel trace file system. \
 \
This subpackage contains the header files."
LICENSE = "LGPL-2.1-only"

PV = "1.6.4"

RPM_NAME = "libtracefs-devel-1.6.4-2.3.aarch64.rpm"
RPM_HASH = "6eeb87ba0700ad34d90f15b620cc75f01bad2be3f9523088418c2d2611fa4d7b248db2715e085772e44f0bd4a74831dc31b46bb65eaa5e6cfcc29945d7a4e62a"

RPROVIDES:${PN} += "libtracefs-devel \
pkgconfig-libtracefs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtracefs1 \
pkgconfig-libtraceevent"

inherit rpm
