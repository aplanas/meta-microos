SUMMARY = "Development package for FUSE (userspace filesystem) modules"
DESCRIPTION = "This package contains all include files, libraries and configuration \
files needed to develop programs that use the fuse (FUSE) library to \
implement file systems in user space. \
 \
With fuse-devel, users can compile and install other user space file \
systems."
LICENSE = "BSD-2-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "3.15.0"

RPM_NAME = "fuse3-devel-3.15.0-1.1.aarch64.rpm"
RPM_HASH = "444f7f234d15a3bec8f5da246031a4aa0ee90601007fb854e4f1163dcc7a9aa377d95bd5a0138e5d7c33deed0383c570f8758ad30457e4ea144c8103baa92902"

RPROVIDES:${PN} += "fuse3-devel \
pkgconfig-fuse3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
fuse3 \
glibc-devel \
libfuse3-3"

inherit rpm
