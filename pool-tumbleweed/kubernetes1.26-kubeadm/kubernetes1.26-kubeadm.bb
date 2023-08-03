SUMMARY = "Kubernetes kubeadm bootstrapping tool"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubeadm bootstrapping tool"
LICENSE = "Apache-2.0"

PV = "1.26.7"

RPM_NAME = "kubernetes1.26-kubeadm-1.26.7-1.1.aarch64.rpm"
RPM_HASH = "1caca2bb0cae2404120dfe7bde893dd53aa9baadff4d732d6752587e627d5604997ccce7895ee8fe8c39fa7097fc1f78a90bcc7caa72a456eedaf9b7d6aaf229"

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
