SUMMARY = "Kubernetes kubeadm bootstrapping tool"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubeadm bootstrapping tool"
LICENSE = "Apache-2.0"

PV = "1.27.4"

RPM_NAME = "kubernetes1.27-kubeadm-1.27.4-2.1.aarch64.rpm"
RPM_HASH = "c9da9a15377498bd9751d51ae4f0719c8491891c23ae30a2ace6261945ad16c08cb3f0a30f33d0c2de53c8b36d1fe77b72f414d97a1f3fc5ae12b3a264967b4b"

RPROVIDES:${PN} += "kubernetes-kubeadm-provider \
kubernetes1.27-kubeadm"

RDEPENDS:${PN} += "cri-runtime \
cri-tools \
ebtables \
ethtool \
kubernetes-kubeadm-criconfig \
shadow \
socat"

inherit rpm
