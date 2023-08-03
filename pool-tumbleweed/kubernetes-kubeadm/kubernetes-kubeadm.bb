SUMMARY = "Kubernetes kubeadm bootstrapping tool"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubeadm bootstrapping tool"
LICENSE = "Apache-2.0"

PV = "1.27.4"

RPM_NAME = "kubernetes-kubeadm-1.27.4-33.1.aarch64.rpm"
RPM_HASH = "bdf3751655dd9387d6a5fc6bf8cf318c186b723678f11083986262bec4b82df11b8abde4f4f7d36322289787d99496134a3221740a9e7ba282024be3e7d1f095"

RPROVIDES:${PN} += "kubernetes-kubeadm"

RDEPENDS:${PN} += "kubernetes1.26-kubelet \
kubernetes1.27-kubeadm \
kubernetes1.27-kubelet"

inherit rpm
