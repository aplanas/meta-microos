SUMMARY = "User space components of the Ceph file system"
DESCRIPTION = "Ceph is a massively scalable, open-source, distributed storage system that runs \
on commodity hardware and delivers object, block and file system storage."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "ceph-16.2.13.66+g54799ee0666-2.1.aarch64.rpm"
RPM_HASH = "93d70d97d09ba4cd5db8945b22c671d977181ac66b5986acd42f916dd11a63781aedbc667a28870c0f74febfcad3d9a8dbffb8b157e75e9ba9d24bab4d1ddf14"

RPROVIDES:${PN} += "ceph \
ceph(aarch-64)"
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
