SUMMARY = "User space components of the Ceph file system"
DESCRIPTION = "Ceph is a massively scalable, open-source, distributed storage system that runs \
on commodity hardware and delivers object, block and file system storage."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.11.65+g8b7e6fc0182"

RPM_NAME = "ceph-16.2.11.65+g8b7e6fc0182-1.1.aarch64.rpm"
RPM_HASH = "c5b764ac081ebb3e1691b01716a896f7541d763d3edfad30d5f98e2fcf10d5ff4550c267c3eb07f490474e8d046da9766dcdf911d7b358c8d6bc4b882ddaf24c"

RPROVIDES:${PN} += "ceph ceph(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/mkdir /usr/bin/touch binutils ceph-mds ceph-mgr ceph-mon ceph-osd fillup systemd"

inherit rpm
