SUMMARY = "Ceph CSI helm charts"
DESCRIPTION = "Helm charts for CephFS and RBD access through ceph-csi."
LICENSE = "Apache-2.0"

PV = "3.3.1+git0.a07260f19"

RPM_NAME = "ceph-csi-helm-charts-3.3.1+git0.a07260f19-1.11.noarch.rpm"
RPM_HASH = "8f30d988ade83a088889886b88014583cb07e7dbac9a477a9be3b4fb61e925c96cfd763c97b777903b6d26f049d1a2d50ae03338c8e4df9faae103c88038a485"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ceph-csi-helm-charts"
RDEPENDS:${PN} += "/bin/bash"

inherit rpm
