SUMMARY = "Volatile Memory allocation library"
DESCRIPTION = "The libvmem library turns a pool of persistent memory into a volatile \
memory pool, similar to the system heap but kept separate and with \
its own malloc-style API."
LICENSE = "BSD-3-Clause"

PV = "1.8"

RPM_NAME = "libvmem1-1.8-2.9.aarch64.rpm"
RPM_HASH = "f8fbaa80af269a456af98ddba3804e59615993d59ba43920ec8308cd463c46ef4e8838fc28f98f94ef5ad13d022ab5e189adf28a72e9ae55ea169fe91d90142c"

RPROVIDES:${PN} += "libvmem.so.1()(64bit) \
libvmem.so.1(LIBVMEM_1.0)(64bit) \
libvmem1 \
libvmem1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
