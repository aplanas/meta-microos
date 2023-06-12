SUMMARY = "Container Storage Interface driver for Ceph block and file"
DESCRIPTION = "Ceph CSI plugins implement an interface between CSI enabled Container \
Orchestrator (CO) and Ceph cluster. It allows dynamically provisioning \
Ceph block and file volumes and attaching them to workloads. \
 \
See https://github.com/ceph/ceph-csi for more information."
LICENSE = "Apache-2.0"

PV = "3.3.1+git0.a07260f19"

RPM_NAME = "ceph-csi-3.3.1+git0.a07260f19-1.12.aarch64.rpm"
RPM_HASH = "7f5af96e5fa7f58e44f0792737c72671d98b293c44ddc33abb9ad6fe3ece90efb4f957dd7c23f589aa8ffa6b5558d35b4847a5b1b4ec1262a22187c921910e5c"

RPROVIDES:${PN} += "ceph-csi ceph-csi(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) librados.so.2()(64bit) librados.so.2(LIBRADOS_14.2.0)(64bit) librbd.so.1()(64bit) pattern()"

inherit rpm
