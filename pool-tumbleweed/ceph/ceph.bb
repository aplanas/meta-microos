SUMMARY = "User space components of the Ceph file system"
DESCRIPTION = "Ceph is a massively scalable, open-source, distributed storage system that runs \
on commodity hardware and delivers object, block and file system storage."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "ceph-16.2.13.66+g54799ee0666-3.1.aarch64.rpm"
RPM_HASH = "33698cf40e9213df9d7abb19a897293665e352d181608952f97e97241b93ffc3cf521ac3cce6fb9584df9e2315c0b86416dbd655ab3ae4f23652696d758a6eed"

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
