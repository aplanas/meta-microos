SUMMARY = "Development package for FUSE (userspace filesystem) modules"
DESCRIPTION = "This package contains all include files, libraries and configuration \
files needed to develop programs that use the fuse (FUSE) library to \
implement file systems in user space. \
 \
With fuse-devel, users can compile and install other user space file \
systems."
LICENSE = "BSD-2-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "3.14.1"

RPM_NAME = "fuse3-devel-3.14.1-2.1.aarch64.rpm"
RPM_HASH = "2c685d73475b060845ae6bbe95b21d5f19f3a257c1ee1d0b1bd8e66c4208b16a61b6fd126e066b6b79e60e282b0336a87dc9d91b38801214e4dd57edf3431586"

RPROVIDES:${PN} += "fuse3-devel \
fuse3-devel(aarch-64) \
pkgconfig(fuse3)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
fuse3 \
glibc-devel \
libfuse3-3"

inherit rpm
