SUMMARY = "Kubernetes kubeadm bootstrapping tool"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubeadm bootstrapping tool"
LICENSE = "Apache-2.0"

PV = "1.25.11"

RPM_NAME = "kubernetes1.25-kubeadm-1.25.11-1.1.aarch64.rpm"
RPM_HASH = "5fc4279d5a5d17414ca302a592a0f298340ff68ece409305613850d34c3766258cac72329ff52bb790f15940f331d17490e2ac0fa9f9a6217a2c53585d8cb543"

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
