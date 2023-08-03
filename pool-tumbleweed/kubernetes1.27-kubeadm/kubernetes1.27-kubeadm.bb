SUMMARY = "Kubernetes kubeadm bootstrapping tool"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubeadm bootstrapping tool"
LICENSE = "Apache-2.0"

PV = "1.27.4"

RPM_NAME = "kubernetes1.27-kubeadm-1.27.4-1.1.aarch64.rpm"
RPM_HASH = "8f00ada5e54c88f8ba1c4f3a56f5a9960bc4bad66ab88a252af2f1eb82937062d4b6ec4195e4a40b07e78d73fd6b9b628f40e9f96169acf206bdfddd0a87d5e0"

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
