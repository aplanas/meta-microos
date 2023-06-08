SUMMARY = "Container Storage Interface driver for Ceph block and file"
DESCRIPTION = "Ceph CSI plugins implement an interface between CSI enabled Container \
Orchestrator (CO) and Ceph cluster. It allows dynamically provisioning \
Ceph block and file volumes and attaching them to workloads. \
 \
See https://github.com/ceph/ceph-csi for more information."
LICENSE = "Apache-2.0"

PV = "3.3.1+git0.a07260f19"

RPM_NAME = "ceph-csi-3.3.1+git0.a07260f19-1.11.aarch64.rpm"
RPM_HASH = "f47531704bed543b4e603fbcb5911822e2a18bd393a281b5e34d5782da08e7bd93c5aec221e15091f39b98bb89b362c1887696267c55e1cb006b581cb5b76384"

RPROVIDES:${PN} += "ceph-csi ceph-csi(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) librados.so.2()(64bit) librados.so.2(LIBRADOS_14.2.0)(64bit) librbd.so.1()(64bit) pattern()"

inherit rpm
