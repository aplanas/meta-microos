SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon (current version)"
LICENSE = "Apache-2.0"

PV = "1.23.17"

RPM_NAME = "kubernetes1.23-kubelet-1.23.17-3.1.aarch64.rpm"
RPM_HASH = "eda3a4cb68de918eacec8fd9ec72434cd7928c06051935ac2094b32898fa92a231ff075a12d25d7c50a830959fcbb0035b372db4dc4407da5382b7df49a61b9a"

RPROVIDES:${PN} += "kubernetes-kubelet1.23 \
kubernetes1.23-kubelet \
kubernetes1.23-kubelet(aarch-64)"

RDEPENDS:${PN} += "cri-runtime \
kubernetes-kubelet-common \
libc.so.6()(64bit) \
systemd"

inherit rpm
