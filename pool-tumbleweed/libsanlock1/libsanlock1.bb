SUMMARY = "A shared disk lock manager library"
DESCRIPTION = "The runtime libraries for sanlock, a shared disk lock manager. \
Hosts connected to a common SAN can use this to synchronize their \
access to the shared disks."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.8.5"

RPM_NAME = "libsanlock1-3.8.5-1.4.aarch64.rpm"
RPM_HASH = "3f7357588210da8a5fc67c2154c28f78f212c4b3b46b65042e2bb6f1ccb3257521a4d65b6eacb1dc9d274df35dd4b83eb45f7333cfd947d9ca4344febeb5cd25"

RPROVIDES:${PN} += "libsanlock-client.so.1 \
libsanlock.so.1 \
libsanlock1 \
libwdmd.so.1 \
sanlock-lib"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaio.so.1 \
libblkid.so.1 \
libc.so.6"

inherit rpm
