SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon (current version)"
LICENSE = "Apache-2.0"

PV = "1.26.6"

RPM_NAME = "kubernetes1.26-kubelet-1.26.6-1.1.aarch64.rpm"
RPM_HASH = "79cbaff60259dfff7ddf71973e05d96a9d8b476518dd99f1339c105baa22252b25828e920cca7754766f3956ff7862f248d7291ecb8cb8d02f12d0342ab23139"

RPROVIDES:${PN} += "kubernetes-kubelet1.26 \
kubernetes1.26-kubelet"

RDEPENDS:${PN} += "cri-runtime \
kubernetes-kubelet-common \
libc.so.6 \
systemd"

inherit rpm
