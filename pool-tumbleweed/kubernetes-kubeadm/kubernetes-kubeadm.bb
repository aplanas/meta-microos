SUMMARY = "Kubernetes kubeadm bootstrapping tool"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubeadm bootstrapping tool"
LICENSE = "Apache-2.0"

PV = "1.27.3"

RPM_NAME = "kubernetes-kubeadm-1.27.3-32.1.aarch64.rpm"
RPM_HASH = "e96d95535d9ef16b2bf7d56ab9ec07faf1efb1dbb24ef00006accf6907478fde1fd17ab0bdfc6bec37ed0046426ecee039622dab0fd1f226f3f0f5f260c2e3cf"

RPROVIDES:${PN} += "kubernetes-kubeadm"

RDEPENDS:${PN} += "kubernetes1.26-kubelet \
kubernetes1.27-kubeadm \
kubernetes1.27-kubelet"

inherit rpm
