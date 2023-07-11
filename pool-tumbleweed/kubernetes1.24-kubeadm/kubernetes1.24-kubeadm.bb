SUMMARY = "Kubernetes kubeadm bootstrapping tool"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubeadm bootstrapping tool"
LICENSE = "Apache-2.0"

PV = "1.24.15"

RPM_NAME = "kubernetes1.24-kubeadm-1.24.15-2.1.aarch64.rpm"
RPM_HASH = "6b3ad00cc7c9f39fba6319ae54158571fe320313074560b8e02e2b0fbafb933750160083f5a00f7b389819f0255624292373a8c6cf9ad76d0db3f4ba827f1688"

RPROVIDES:${PN} += "kubernetes-kubeadm-provider \
kubernetes1.24-kubeadm"

RDEPENDS:${PN} += "cri-runtime \
cri-tools \
ebtables \
ethtool \
kubernetes-kubeadm-criconfig \
shadow \
socat"

inherit rpm
