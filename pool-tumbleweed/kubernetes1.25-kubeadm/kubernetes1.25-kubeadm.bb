SUMMARY = "Kubernetes kubeadm bootstrapping tool"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubeadm bootstrapping tool"
LICENSE = "Apache-2.0"

PV = "1.25.12"

RPM_NAME = "kubernetes1.25-kubeadm-1.25.12-1.1.aarch64.rpm"
RPM_HASH = "946018944ddfe371d4319c36fb5ed000487cd97a9dd9617f90b4f9925b6a81dcae5d23ceeedddb7373b99175d6081f808eb25299298801f0fcd2dceffbf4b82b"

RPROVIDES:${PN} += "kubernetes-kubeadm-provider \
kubernetes1.25-kubeadm"

RDEPENDS:${PN} += "cri-runtime \
cri-tools \
ebtables \
ethtool \
kubernetes-kubeadm-criconfig \
shadow \
socat"

inherit rpm
