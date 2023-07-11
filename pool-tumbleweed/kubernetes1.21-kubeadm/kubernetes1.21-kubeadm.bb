SUMMARY = "Kubernetes kubeadm bootstrapping tool"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubeadm bootstrapping tool"
LICENSE = "Apache-2.0"

PV = "1.21.14"

RPM_NAME = "kubernetes1.21-kubeadm-1.21.14-2.3.aarch64.rpm"
RPM_HASH = "27256b2dcb2cc37a2cf7271edb998e490676c9fc0e3d5deb259cc8e37b49888ff53c7dd02424669207d67a06543da9e6e50f29a758ff34a93a3dcdf644f4d181"

RPROVIDES:${PN} += "kubernetes-kubeadm-provider \
kubernetes1.21-kubeadm"

RDEPENDS:${PN} += "cri-runtime \
ebtables \
ethtool \
kubernetes-kubeadm-criconfig \
shadow \
socat"

inherit rpm
