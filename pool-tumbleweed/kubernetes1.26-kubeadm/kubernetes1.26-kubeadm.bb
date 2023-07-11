SUMMARY = "Kubernetes kubeadm bootstrapping tool"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubeadm bootstrapping tool"
LICENSE = "Apache-2.0"

PV = "1.26.6"

RPM_NAME = "kubernetes1.26-kubeadm-1.26.6-1.1.aarch64.rpm"
RPM_HASH = "3bad26f00fe9436313ca04ccd89655e52171f0c7ee4bcf84a5cc5190e46d8dfd62eac6d9c5ce35ceba7694933cc59973c22d4ed7f79044a451e4c02ea3bea7ef"

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
