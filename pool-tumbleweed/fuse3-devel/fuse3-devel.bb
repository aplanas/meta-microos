SUMMARY = "Development package for FUSE (userspace filesystem) modules"
DESCRIPTION = "This package contains all include files, libraries and configuration \
files needed to develop programs that use the fuse (FUSE) library to \
implement file systems in user space. \
 \
With fuse-devel, users can compile and install other user space file \
systems."
LICENSE = "BSD-2-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "3.16.1"

RPM_NAME = "fuse3-devel-3.16.1-1.1.aarch64.rpm"
RPM_HASH = "3c7057d8febd4b8a9600b9e4d47675a01e31dbb14403da5602841f9dadb483adcb288f473e516d9552d5e3d2a81ae5328f9d79aabe05aa8a2c4f5d0ffb9d317a"

RPROVIDES:${PN} += "fuse3-devel \
pkgconfig-fuse3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
fuse3 \
glibc-devel \
libfuse3-3"

inherit rpm
