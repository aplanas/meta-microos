SUMMARY = "Kubernetes kubeadm bootstrapping tool"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubeadm bootstrapping tool"
LICENSE = "Apache-2.0"

PV = "1.20.15"

RPM_NAME = "kubernetes1.20-kubeadm-1.20.15-2.2.aarch64.rpm"
RPM_HASH = "61149b455b0da22847c6f9837b2bcddf914b97780ae60666c015c2caaff054cf3899adbe96232ec29196b6794be4dab4d5b0f8b22da6b4d7097fb0a2add58e7e"

RPROVIDES:${PN} += "kubernetes-kubeadm-provider \
kubernetes1.20-kubeadm \
kubernetes1.20-kubeadm(aarch-64)"
RDEPENDS:${PN} += "(kmod(br_netfilter.ko) if kernel) \
(kubernetes1.20-kubelet or kubernetes1.19-kubelet) \
cri-runtime \
ebtables \
ethtool \
kubernetes-kubeadm-criconfig \
shadow \
socat"

inherit rpm
