SUMMARY = "Runtime library of libguestfs"
DESCRIPTION = "Shared object library for libguestfs tools which are used to access \
and modify virtual machines."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfs0-1.50.1-3.3.aarch64.rpm"
RPM_HASH = "b3cab6708b9fdc173242f3ad516a7b3c8638e29bf0a49a098fc3fa365cccc044f9dfd181789af1f3d10bf3a067b8831d4720074d7e07d2e2045de128d13aecdb"

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
