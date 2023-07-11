SUMMARY = "Kubernetes kubeadm bootstrapping tool"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubeadm bootstrapping tool"
LICENSE = "Apache-2.0"

PV = "1.22.17"

RPM_NAME = "kubernetes1.22-kubeadm-1.22.17-2.3.aarch64.rpm"
RPM_HASH = "f87064e60fb02ea61c5af89a209e0c26e978a54faa90eb4c49b1e3ed961b3b66dbf0c2ed8a247506dbbd2784c58f0760e93f5e95be3ca268b3e094edde6419ab"

RPROVIDES:${PN} += "kubernetes-kubeadm-provider \
kubernetes1.22-kubeadm"

RDEPENDS:${PN} += "cri-runtime \
cri-tools \
ebtables \
ethtool \
kubernetes-kubeadm-criconfig \
shadow \
socat"

inherit rpm
