SUMMARY = "Development package for FUSE (userspace filesystem) modules"
DESCRIPTION = "This package contains all include files, libraries and configuration \
files needed to develop programs that use the fuse (FUSE) library to \
implement file systems in user space. \
 \
With fuse-devel, users can compile and install other user space file \
systems."
LICENSE = "BSD-2-Clause & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.14.1"

RPM_NAME = "fuse3-devel-3.14.1-1.1.aarch64.rpm"
RPM_HASH = "bc2082a47315f17a8d5c9a7709356738d8fd111cb149b380972aec85676e8a56f4db2d4aa7c860d22bf454b19072db16c3cdee9c8c7f706943104fba899308eb"

RPROVIDES:${PN} += "fuse3-devel fuse3-devel(aarch-64) pkgconfig(fuse3)"
RDEPENDS:${PN} += "/usr/bin/pkg-config fuse3 glibc-devel libfuse3-3"

inherit rpm
