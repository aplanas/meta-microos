SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon (current version)"
LICENSE = "Apache-2.0"

PV = "1.20.15"

RPM_NAME = "kubernetes1.20-kubelet-1.20.15-2.3.aarch64.rpm"
RPM_HASH = "428cb125cb5dc8baf771963302af83e801c7d08784b5346c71b5e3af01927a1cce604058edc1dffb858c6f80333c1ee841511a59754c451c639095e3abd32677"

RPROVIDES:${PN} += "kubernetes-kubelet1.20 \
kubernetes1.20-kubelet"

RDEPENDS:${PN} += "cri-runtime \
kubernetes-kubelet-common \
libc.so.6 \
systemd"

inherit rpm
