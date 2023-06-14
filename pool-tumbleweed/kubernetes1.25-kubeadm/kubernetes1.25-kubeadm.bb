SUMMARY = "Kubernetes kubeadm bootstrapping tool"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubeadm bootstrapping tool"
LICENSE = "Apache-2.0"

PV = "1.25.9"

RPM_NAME = "kubernetes1.25-kubeadm-1.25.9-1.2.aarch64.rpm"
RPM_HASH = "37f8024aa50172ad75419ba5d6e3f65d9574110bada8a633d092f7bb4728407bfbecfdefd2801dc65e9206bc0ec872528e97be2910dda277deb9ae6661de9e8b"

RPROVIDES:${PN} += "kubernetes-kubeadm-provider \
kubernetes1.25-kubeadm"

RDEPENDS:${PN} += "-kmod(br-netfilter.ko) if kernel \
-kubernetes1.25-kubelet or kubernetes1.24-kubelet \
cri-runtime \
cri-tools \
ebtables \
ethtool \
kubernetes-kubeadm-criconfig \
shadow \
socat"

inherit rpm
