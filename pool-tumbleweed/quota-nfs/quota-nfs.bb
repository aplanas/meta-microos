SUMMARY = "Disk Quota System on NFS"
DESCRIPTION = "The quotad init script, which provides quota support on NFS mounts."
LICENSE = "GPL-2.0-only"

PV = "4.09"

RPM_NAME = "quota-nfs-4.09-2.4.aarch64.rpm"
RPM_HASH = "83680dc0ac01172b6639e65eda236dcad6f5bac455c3fcfc31e8ec6097c799fbaf844c39ae84364b6d3d3a8154d6576189cdfcaf1a7d78f51fb1d4de87abe814"

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
