SUMMARY = "Ceph distributed file system headers"
DESCRIPTION = "This package contains libraries and headers needed to develop programs \
that use Ceph distributed file system."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "libcephfs-devel-16.2.13.66+g54799ee0666-4.1.aarch64.rpm"
RPM_HASH = "cb8a121a5ae72e81da307455d86d777579b37b72c3c30263f88b2e3ef3fdeba77394431106f560fd7a6ac719b8a30d31eff3c9ba7a372461055ee2dcdc1ff136"

RPROVIDES:${PN} += "libcephfs-devel \
libcephfs2-devel"

RDEPENDS:${PN} += "libcephfs2 \
librados-devel"

inherit rpm
