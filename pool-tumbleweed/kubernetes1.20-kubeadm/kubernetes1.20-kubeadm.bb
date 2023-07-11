SUMMARY = "Kubernetes kubeadm bootstrapping tool"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubeadm bootstrapping tool"
LICENSE = "Apache-2.0"

PV = "1.20.15"

RPM_NAME = "kubernetes1.20-kubeadm-1.20.15-2.3.aarch64.rpm"
RPM_HASH = "88a35d6bd83654fdc591dff50c0b284f24aaae3f6df604c4e7849b8e95adf315cbc7679cf1f73db89f529c47f840f6b91bc05c0aad4480cb56fcb074fd3df15c"

RPROVIDES:${PN} += "kubernetes-kubeadm-provider \
kubernetes1.20-kubeadm"

RDEPENDS:${PN} += "cri-runtime \
ebtables \
ethtool \
kubernetes-kubeadm-criconfig \
shadow \
socat"

inherit rpm
