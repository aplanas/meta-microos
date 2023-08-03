SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon (current version)"
LICENSE = "Apache-2.0"

PV = "1.27.4"

RPM_NAME = "kubernetes1.27-kubelet-1.27.4-1.1.aarch64.rpm"
RPM_HASH = "66faafb1f741567b9f4ced3ae057736cb6082c0f458c730b8051b6263ba1fecd70d79f48fcc5e1da1319c88a4b0a4d1211185a2db0598c198b6e598bf4b4e1d1"

RPROVIDES:${PN} += "kubernetes-kubelet1.27 \
kubernetes1.27-kubelet"

RDEPENDS:${PN} += "cri-runtime \
kubernetes-kubelet-common \
libc.so.6 \
systemd"

inherit rpm
