SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon"
LICENSE = "Apache-2.0"

PV = "1.27.1"

RPM_NAME = "kubernetes1.27-kubelet-common-1.27.1-1.2.aarch64.rpm"
RPM_HASH = "a8270df0095f75c36a1a5b6c3538b6b21ac923c9c9035224c402061f73873d132d3ddf6e44665210ead9dd51ffbda6630177d36ad96e1462bc9d0852bda079fa"

RPROVIDES:${PN} += "kubernetes-kubelet-common \
kubernetes1.27-kubelet-common \
kubernetes1.27-kubelet-common(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
cri-runtime \
kubernetes-kubelet1.27"

inherit rpm
