SUMMARY = "Development package for FUSE (userspace filesystem) modules"
DESCRIPTION = "This package contains all include files, libraries and configuration \
files needed to develop programs that use the fuse (FUSE) library to \
implement file systems in user space. \
 \
With fuse-devel, users can compile and install other user space file \
systems."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.9.9"

RPM_NAME = "fuse-devel-2.9.9-6.3.aarch64.rpm"
RPM_HASH = "4aa1610b8a3fd9228acf81d184fbb551dfccaa7af2801ea9f447af10853a21d62d955ac169b80c24002793e2261bfaecee94c406e1e0e63e23805d0894765052"

RPROVIDES:${PN} += "fuse-devel \
fuse-devel(aarch-64) \
pkgconfig(fuse)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
fuse \
fuse-doc \
glibc-devel \
libfuse2 \
libulockmgr1"

inherit rpm
