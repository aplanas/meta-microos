SUMMARY = "Ceph distributed file system headers"
DESCRIPTION = "This package contains libraries and headers needed to develop programs \
that use Ceph distributed file system."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "libcephfs-devel-16.2.13.66+g54799ee0666-3.1.aarch64.rpm"
RPM_HASH = "88833a4a0de505b84b82fe5a7b2765be6e0eb43e58a922edb8841d3833491a50030e8bdc5b95f042183be894f813362d625d64e0499069f40923349c1c43f8e5"

RPROVIDES:${PN} += "libcephfs-devel \
libcephfs2-devel"

RDEPENDS:${PN} += "libcephfs2 \
librados-devel"

inherit rpm
