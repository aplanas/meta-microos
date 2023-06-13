SUMMARY = "Development files for the Volatile allocation library"
DESCRIPTION = "The libvmem library turns a pool of persistent memory into a volatile \
memory pool, similar to the system heap but kept separate and with \
its own malloc-style API. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libvmem."
LICENSE = "BSD-3-Clause"

PV = "1.8"

RPM_NAME = "libvmem-devel-1.8-2.9.aarch64.rpm"
RPM_HASH = "2f6e6f2dacb47fa546b0f7cf456dc9faf8bcb5306642a64b921373b329699b09a6fa6f6032d0660ceff753b09e5b9dc6bf093a9e196c1a41b451b21119e1fb32"

RPROVIDES:${PN} += "libvmem-devel \
libvmem-devel(aarch-64) \
libvmem.so.1()(64bit) \
libvmem.so.1(LIBVMEM_1.0)(64bit) \
pkgconfig(libvmem)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libvmem1"

inherit rpm
