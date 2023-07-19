SUMMARY = "Runtime library of libguestfs"
DESCRIPTION = "Shared object library for libguestfs tools which are used to access \
and modify virtual machines."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfs0-1.50.1-4.1.aarch64.rpm"
RPM_HASH = "822558684e6325312ade2e4d2b500d87eec73a7b95d4da3617918bc759c345becee4a2ae0ee16fac5b200e055bb2ea2a0fff4aa702f30d9c074945e0e0107f19"

RPROVIDES:${PN} += "libguestfs.so.0 \
libguestfs0"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/qemu-system-aarch64 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse.so.2 \
libjansson.so.4 \
libpcre2-8.so.0 \
libselinux.so.1 \
libtirpc.so.3 \
libvirt.so.0 \
libxml2.so.2"

inherit rpm
