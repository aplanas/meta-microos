SUMMARY = "Kubernetes kubeadm bootstrapping tool"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubeadm bootstrapping tool"
LICENSE = "Apache-2.0"

PV = "1.26.4"

RPM_NAME = "kubernetes1.26-kubeadm-1.26.4-1.2.aarch64.rpm"
RPM_HASH = "1ce3b77029091b9f9a75a5302fb9b349970ebfea7d0b828681ea59b1bc6adb0cfff49e1ad6f5469cf7698aab9b95a63fde6f97cf9af03ab1b0174289e1f3ec1f"

RPROVIDES:${PN} += "kubernetes-kubeadm-provider \
kubernetes1.26-kubeadm"

RDEPENDS:${PN} += "-kmod(br-netfilter.ko) if kernel \
-kubernetes1.26-kubelet or kubernetes1.25-kubelet \
cri-runtime \
cri-tools \
ebtables \
ethtool \
kubernetes-kubeadm-criconfig \
shadow \
socat"

inherit rpm
