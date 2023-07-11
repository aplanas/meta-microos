SUMMARY = "Container Storage Interface driver for Ceph block and file"
DESCRIPTION = "Ceph CSI plugins implement an interface between CSI enabled Container \
Orchestrator (CO) and Ceph cluster. It allows dynamically provisioning \
Ceph block and file volumes and attaching them to workloads. \
 \
See https://github.com/ceph/ceph-csi for more information."
LICENSE = "Apache-2.0"

PV = "3.3.1+git0.a07260f19"

RPM_NAME = "ceph-csi-3.3.1+git0.a07260f19-1.13.aarch64.rpm"
RPM_HASH = "48a1535cf16e14e15c5ab2459b3e628e52d3e2ba91b58bf66e1c761b12045358ca6a394ba317ed644bdc28ca0aba65f2018d61cb51f448768ba25a7750853cc6"

RPROVIDES:${PN} += "ceph-csi"

RDEPENDS:${PN} += "libc.so.6 \
librados.so.2 \
librbd.so.1 \
pattern-"

inherit rpm
