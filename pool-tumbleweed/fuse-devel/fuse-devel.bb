SUMMARY = "Development package for FUSE (userspace filesystem) modules"
DESCRIPTION = "This package contains all include files, libraries and configuration \
files needed to develop programs that use the fuse (FUSE) library to \
implement file systems in user space. \
 \
With fuse-devel, users can compile and install other user space file \
systems."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.9.9"

RPM_NAME = "fuse-devel-2.9.9-6.4.aarch64.rpm"
RPM_HASH = "08fc83e934afe2959f7b7dfaab68da426c2576cd94e000b555cbd9d8ad78d5d6ec16e68117a7a732ec095a74f0f3d8cb9c0c0fa1bc296975c6c6b4c899a09385"

RPROVIDES:${PN} += "fuse-devel \
pkgconfig-fuse"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
fuse \
fuse-doc \
glibc-devel \
libfuse2 \
libulockmgr1"

inherit rpm
