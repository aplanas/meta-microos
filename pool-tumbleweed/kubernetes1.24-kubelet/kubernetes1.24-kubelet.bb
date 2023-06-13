SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon (current version)"
LICENSE = "Apache-2.0"

PV = "1.24.13"

RPM_NAME = "kubernetes1.24-kubelet-1.24.13-2.2.aarch64.rpm"
RPM_HASH = "79eeb5fd4e55f92a6910467cac135acc07eb3b772123bbdd459870f8930c8cbd1247c8ed71bf7d27519357bb8592b57334afc432d2b363684bd6a9d593732f30"

RPROVIDES:${PN} += "kubernetes-kubelet1.24 \
kubernetes1.24-kubelet \
kubernetes1.24-kubelet(aarch-64)"

RDEPENDS:${PN} += "cri-runtime \
kubernetes-kubelet-common \
libc.so.6()(64bit) \
systemd"

inherit rpm
