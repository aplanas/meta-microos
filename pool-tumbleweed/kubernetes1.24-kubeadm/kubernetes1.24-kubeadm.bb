SUMMARY = "Kubernetes kubeadm bootstrapping tool"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubeadm bootstrapping tool"
LICENSE = "Apache-2.0"

PV = "1.24.13"

RPM_NAME = "kubernetes1.24-kubeadm-1.24.13-2.2.aarch64.rpm"
RPM_HASH = "a231d4ffce1c29d6eaac1853680c25e23ef04228f366c45c7f133092a3b52976fff9288e5aede88fef62737237fe4fea18a840826ed49a0b74640e8d2c0ac2de"

RPROVIDES:${PN} += "kubernetes-kubeadm-provider \
kubernetes1.24-kubeadm"

RDEPENDS:${PN} += "-kmod(br-netfilter.ko) if kernel \
-kubernetes1.24-kubelet or kubernetes1.23-kubelet \
cri-runtime \
cri-tools \
ebtables \
ethtool \
kubernetes-kubeadm-criconfig \
shadow \
socat"

inherit rpm
