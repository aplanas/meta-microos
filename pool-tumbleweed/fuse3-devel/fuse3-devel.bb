SUMMARY = "Development package for FUSE (userspace filesystem) modules"
DESCRIPTION = "This package contains all include files, libraries and configuration \
files needed to develop programs that use the fuse (FUSE) library to \
implement file systems in user space. \
 \
With fuse-devel, users can compile and install other user space file \
systems."
LICENSE = "BSD-2-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "3.15.1"

RPM_NAME = "fuse3-devel-3.15.1-1.1.aarch64.rpm"
RPM_HASH = "e382db2247a3ede4273bae1b784161f568cc4f6749ff50d16aa06029a9b8d3e15de391db989f741dc1834ba1f7771eeb899b98917d1ac74410c6c3371cd49328"

RPROVIDES:${PN} += "fuse3-devel \
pkgconfig-fuse3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
fuse3 \
glibc-devel \
libfuse3-3"

inherit rpm
