SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon"
LICENSE = "Apache-2.0"

PV = "1.23.17"

RPM_NAME = "kubernetes1.23-kubelet-common-1.23.17-3.1.aarch64.rpm"
RPM_HASH = "eb31b3dae0a40c6deb1a64269621b3b2a24298a924cdc9b618b62bedbcedc1aa0a9011715599429e2a9a5d752d45b08413f5ce3ec208b509ed725fd91be22415"

RPROVIDES:${PN} += "kubernetes-kubelet-common \
kubernetes1.23-kubelet-common \
kubernetes1.23-kubelet-common(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
cri-runtime \
kubernetes-kubelet1.23"

inherit rpm
