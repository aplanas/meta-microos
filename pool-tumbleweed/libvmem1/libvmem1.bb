SUMMARY = "Volatile Memory allocation library"
DESCRIPTION = "The libvmem library turns a pool of persistent memory into a volatile \
memory pool, similar to the system heap but kept separate and with \
its own malloc-style API."
LICENSE = "BSD-3-Clause"

PV = "1.8"

RPM_NAME = "libvmem1-1.8-2.10.aarch64.rpm"
RPM_HASH = "38ee4c2adce695a0e35fef443a572a5e0734f506e4ecba8222940e8103628c46678ecb83587547cef338bbef0b64a1a7a658cac23fb67ef2b461878ca74c1b8a"

RPROVIDES:${PN} += "libvmem.so.1 \
libvmem1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
