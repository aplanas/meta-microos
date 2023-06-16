SUMMARY = "Disk Quota System on NFS"
DESCRIPTION = "The quotad init script, which provides quota support on NFS mounts."
LICENSE = "GPL-2.0-only"

PV = "4.09"

RPM_NAME = "quota-nfs-4.09-2.3.aarch64.rpm"
RPM_HASH = "27b7f911f64a05aa160e2558af8440529f55439640c2a7b4cae4de2672d62d742d9dc233e336497b8750b775babb7794f642015e880b7c9c70e4722f8b0f9089"

RPROVIDES:${PN} += "quota-nfs"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtirpc.so.3 \
libwrap.so.0 \
nfs-kernel-server \
quota \
rpcbind"

inherit rpm
