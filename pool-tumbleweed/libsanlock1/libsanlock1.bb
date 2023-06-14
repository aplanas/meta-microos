SUMMARY = "A shared disk lock manager library"
DESCRIPTION = "The runtime libraries for sanlock, a shared disk lock manager. \
Hosts connected to a common SAN can use this to synchronize their \
access to the shared disks."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.8.5"

RPM_NAME = "libsanlock1-3.8.5-1.3.aarch64.rpm"
RPM_HASH = "071737978673d2d58692bfa56148fcebd3de112b63b82b2ff8b2bfb4e68a4bb01d2859955747cac60422c8ee27ff526b95d43ba152543f2285dd3575800b263c"

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
