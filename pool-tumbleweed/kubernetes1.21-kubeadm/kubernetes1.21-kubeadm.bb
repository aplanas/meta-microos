SUMMARY = "Kubernetes kubeadm bootstrapping tool"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubeadm bootstrapping tool"
LICENSE = "Apache-2.0"

PV = "1.21.14"

RPM_NAME = "kubernetes1.21-kubeadm-1.21.14-2.2.aarch64.rpm"
RPM_HASH = "79741ccc37dea5611ce7679852561d26533b926abb2be6b53b63c2fe734b77942efb7af17e845cd63cfb7f14802c4e0d32adc44f25a114ccc74fb9df89176b46"

RPROVIDES:${PN} += "kubernetes-kubeadm-provider \
kubernetes1.21-kubeadm"

RDEPENDS:${PN} += "-kmod(br-netfilter.ko) if kernel \
-kubernetes1.21-kubelet or kubernetes1.20-kubelet \
cri-runtime \
ebtables \
ethtool \
kubernetes-kubeadm-criconfig \
shadow \
socat"

inherit rpm
