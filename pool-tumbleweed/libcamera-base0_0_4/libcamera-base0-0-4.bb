SUMMARY = "A complex camera support library in C++"
DESCRIPTION = "libcamera is an experimental camera user-space API. \
 \
A camera may consist of multiple sensors or function blocks, and can \
expose multiple kernel device nodes in /dev for different stages of \
the pipeline. The libcamera API groups and exposes these pieces as \
what users consider one 'camera'."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.0.4"

RPM_NAME = "libcamera-base0_0_4-0.0.4-2.5.aarch64.rpm"
RPM_HASH = "08150988ae0ae07eb3b92e30d7b323a8b3c7958c870eb0dfeacda48fea86cb515aede00aff3a571efe80723f16689e932f2b733982aaa0f657b58eed8052b5dd"

RPROVIDES:${PN} += "libcamera-base.so.0.0.4 \
libcamera-base0-0-4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdw.so.1 \
libgcc-s.so.1 \
libstdc++.so.6 \
libunwind.so.8"

inherit rpm
