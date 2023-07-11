SUMMARY = "Reference implementation of the 'Filesystem in Userspace'"
DESCRIPTION = "FUSE (Filesystem in Userspace) is an interface by the Linux kernel \
for userspace programs to export a filesystem to the kernel. \
 \
This package contains helper programs for using FUSE mounts. \
 \
FUSE file systems are typically implemented as a standalone \
applications in their own right and are packaged separately."
LICENSE = "BSD-2-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "3.15.0"

RPM_NAME = "fuse3-3.15.0-1.1.aarch64.rpm"
RPM_HASH = "178dbdfaf6824247244a4466a94f4a7e6752355cd1b4620312b0475fa215c8e8678f0562359818e6cd0dc7fb88e68ffa6568053ff0f83769071b81ff72472b64"

RPROVIDES:${PN} += "config-fuse3 \
fuse3"

RDEPENDS:${PN} += "/usr/bin/sh \
group-trusted \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse3.so.3 \
permissions \
util-linux"

inherit rpm
