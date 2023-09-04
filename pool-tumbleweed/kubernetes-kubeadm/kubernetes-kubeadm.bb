SUMMARY = "Kubernetes kubeadm bootstrapping tool"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubeadm bootstrapping tool"
LICENSE = "Apache-2.0"

PV = "1.27.4"

RPM_NAME = "kubernetes-kubeadm-1.27.4-34.1.aarch64.rpm"
RPM_HASH = "bdc6aaeddb2260958e47e03969b8b41540e80efbb50ad3ae0f2b1c6210bbbd20d0ac1153d678bd8cfbceb1f1015affda793e255a4ccd087fbf076d74148c6997"

RPROVIDES:${PN} += "kubernetes-kubeadm"

RDEPENDS:${PN} += "kubernetes1.26-kubelet \
kubernetes1.27-kubeadm \
kubernetes1.27-kubelet"

inherit rpm
