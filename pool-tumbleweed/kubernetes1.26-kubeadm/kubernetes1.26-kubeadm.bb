SUMMARY = "Kubernetes kubeadm bootstrapping tool"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubeadm bootstrapping tool"
LICENSE = "Apache-2.0"

PV = "1.26.7"

RPM_NAME = "kubernetes1.26-kubeadm-1.26.7-2.1.aarch64.rpm"
RPM_HASH = "9f4e48ddb4cd87bf5c2b814c7eeacb19bdec675a8516614af583f8d9aec1329354ab7f1f1934d572c3452e631551f7a37479be424adb092ea9af8ee1db691be0"

RPROVIDES:${PN} += "kubernetes-kubeadm-provider \
kubernetes1.26-kubeadm"

RDEPENDS:${PN} += "cri-runtime \
cri-tools \
ebtables \
ethtool \
kubernetes-kubeadm-criconfig \
shadow \
socat"

inherit rpm
