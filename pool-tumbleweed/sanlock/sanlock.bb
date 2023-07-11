SUMMARY = "A shared disk lock manager"
DESCRIPTION = "sanlock uses disk paxos to manage leases on shared storage. \
Hosts connected to a common SAN can use this to synchronize their \
access to the shared disks."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.8.5"

RPM_NAME = "sanlock-3.8.5-1.4.aarch64.rpm"
RPM_HASH = "1c6510b75f920fa8d1bf3f435724082ce1a5395f48b01ff1c02cc851c8ce2543df81b908e47b4aa4327b4378ea7630ca00cbde9fc529e95fe8b9af6c2234e88f"

RPROVIDES:${PN} += "config-sanlock \
python2-sanlock \
sanlock"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
group-disk \
ld-linux-aarch64.so.1 \
libaio.so.1 \
libblkid.so.1 \
libc.so.6 \
libsanlock.so.1 \
libuuid.so.1 \
libwdmd.so.1 \
shadow \
systemd"

inherit rpm
