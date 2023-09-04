SUMMARY = "Runtime library of libguestfs"
DESCRIPTION = "Shared object library for libguestfs tools which are used to access \
and modify virtual machines."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfs0-1.50.1-4.2.aarch64.rpm"
RPM_HASH = "6a64e7d614f471875510f1b42c6c7f34a1261f76af5491e256840416666e308bf41fb70e7ca02d85a51c887ec1ab3eeda110bf2d3619a39bd1a6ee5456dc780a"

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
