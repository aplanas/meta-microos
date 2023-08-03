SUMMARY = "Kubernetes kubeadm bootstrapping tool"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubeadm bootstrapping tool"
LICENSE = "Apache-2.0"

PV = "1.24.16"

RPM_NAME = "kubernetes1.24-kubeadm-1.24.16-1.1.aarch64.rpm"
RPM_HASH = "5a2d77fbf85c16930ee1f9ca5f400325af87eeebb3cfbbbdded5bbb9ee677b26499f9edc9f1411a6f1d3654db26300a5478a40423d7f084aa74e47a5261af2a3"

RPROVIDES:${PN} += "kubernetes-kubeadm-provider \
kubernetes1.24-kubeadm"

RDEPENDS:${PN} += "cri-runtime \
cri-tools \
ebtables \
ethtool \
kubernetes-kubeadm-criconfig \
shadow \
socat"

inherit rpm
