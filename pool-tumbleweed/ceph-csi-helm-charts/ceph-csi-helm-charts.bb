SUMMARY = "Ceph CSI helm charts"
DESCRIPTION = "Helm charts for CephFS and RBD access through ceph-csi."
LICENSE = "Apache-2.0"

PV = "3.3.1+git0.a07260f19"

RPM_NAME = "ceph-csi-helm-charts-3.3.1+git0.a07260f19-1.12.noarch.rpm"
RPM_HASH = "b81894e73f5d52fe7f3c72ce08d8db978081327b71d0bb1df43fe6ccdf9f8085c53a91186cfaca9e82060d1c034ca3c3c32da5246fdadf87625ffe72c5f11ec5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ceph-csi-helm-charts"
RDEPENDS:${PN} += "/bin/bash"

inherit rpm
