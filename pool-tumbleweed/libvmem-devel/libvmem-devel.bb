SUMMARY = "Development files for the Volatile allocation library"
DESCRIPTION = "The libvmem library turns a pool of persistent memory into a volatile \
memory pool, similar to the system heap but kept separate and with \
its own malloc-style API. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libvmem."
LICENSE = "BSD-3-Clause"

PV = "1.8"

RPM_NAME = "libvmem-devel-1.8-2.10.aarch64.rpm"
RPM_HASH = "5387a953249de3cae5b9ba14fe39b0bbce31c024a40602c7ed75b2eb36fd0c7a0e46c9bff3aaaa6e7d88d700d19361953765db6d83a7dc78985ea00328b5f362"

RPROVIDES:${PN} += "libvmem-devel \
libvmem.so.1 \
pkgconfig-libvmem"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libvmem1"

inherit rpm
