SUMMARY = "Kubernetes kubeadm bootstrapping tool"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubeadm bootstrapping tool"
LICENSE = "Apache-2.0"

PV = "1.27.3"

RPM_NAME = "kubernetes1.27-kubeadm-1.27.3-1.1.aarch64.rpm"
RPM_HASH = "b347d73d879f166893f6510b83fa22424db911b2263f3bcf4d9e1a9fb9193acdc7c4dc689bef764b4c129235fdce4fa6d86a8e6236b089b2e1c3dba49ee26c8e"

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
