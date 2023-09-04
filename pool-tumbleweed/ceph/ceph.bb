SUMMARY = "User space components of the Ceph file system"
DESCRIPTION = "Ceph is a massively scalable, open-source, distributed storage system that runs \
on commodity hardware and delivers object, block and file system storage."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "ceph-16.2.13.66+g54799ee0666-4.1.aarch64.rpm"
RPM_HASH = "02987e08d474b3b8f67f97faff05db1b9fd04cc2349db48c81a5c05d5081973da2c5617dc4edd22cd4b78cd3cee5d0e6cd9fdbb4f92ca23b791ea9da6a6e6f95"

RPROVIDES:${PN} += "ceph"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/touch \
binutils \
ceph-mds \
ceph-mgr \
ceph-mon \
ceph-osd \
fillup \
systemd"

inherit rpm
