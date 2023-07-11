SUMMARY = "Kubernetes kubeadm bootstrapping tool"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubeadm bootstrapping tool"
LICENSE = "Apache-2.0"

PV = "1.23.17"

RPM_NAME = "kubernetes1.23-kubeadm-1.23.17-5.1.aarch64.rpm"
RPM_HASH = "c5e17d584e38f546ea4e893dd172f6275cab01cc4fab4c99c51756239781d51be8042c4fafd7517cb2f809fe4e5ed03fbf3fdf2caf7675408304e07165b33b02"

RPROVIDES:${PN} += "kubernetes-kubeadm-provider \
kubernetes1.23-kubeadm"

RDEPENDS:${PN} += "cri-runtime \
cri-tools \
ebtables \
ethtool \
kubernetes-kubeadm-criconfig \
shadow \
socat"

inherit rpm
