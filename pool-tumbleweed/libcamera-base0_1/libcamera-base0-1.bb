SUMMARY = "A complex camera support library in C++"
DESCRIPTION = "libcamera is an experimental camera user-space API. \
 \
A camera may consist of multiple sensors or function blocks, and can \
expose multiple kernel device nodes in /dev for different stages of \
the pipeline. The libcamera API groups and exposes these pieces as \
what users consider one 'camera'."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.1.0"

RPM_NAME = "libcamera-base0_1-0.1.0-1.1.aarch64.rpm"
RPM_HASH = "4bf01653f96a03e9894644d447c8153d7d696eaa503b5cc44ed3f608acdd5deed58ca1c2d17f2d97638889733cb393f6016482e1b7474e77e9e4280e726d6989"

RPROVIDES:${PN} += "libcamera-base.so.0.1 \
libcamera-base0-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdw.so.1 \
libgcc-s.so.1 \
libstdc++.so.6 \
libunwind.so.8"

inherit rpm
