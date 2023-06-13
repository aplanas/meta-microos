SUMMARY = "Kubernetes kubeadm bootstrapping tool"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubeadm bootstrapping tool"
LICENSE = "Apache-2.0"

PV = "1.27.1"

RPM_NAME = "kubernetes-kubeadm-1.27.1-30.1.aarch64.rpm"
RPM_HASH = "c90ade46ffecd8d0eab742dd7ac0000ca9ddb7ea2e8b00d44b8691cfb5655c51bf40f7c0eb6211eb66e43ca42a69fb58a26a2bbedcd19f6249de9fcfb472df81"

RPROVIDES:${PN} += "kubernetes-kubeadm \
kubernetes-kubeadm(aarch-64)"

RDEPENDS:${PN} += "kubernetes1.26-kubelet \
kubernetes1.27-kubeadm \
kubernetes1.27-kubelet"

inherit rpm
