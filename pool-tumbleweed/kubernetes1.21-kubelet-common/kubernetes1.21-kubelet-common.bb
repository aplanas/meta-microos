SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon"
LICENSE = "Apache-2.0"

PV = "1.21.14"

RPM_NAME = "kubernetes1.21-kubelet-common-1.21.14-2.2.aarch64.rpm"
RPM_HASH = "94f5f50691812efd3eb216528bb0025181869fb36a86345f1d67ffa41122fee28c6590e58272322d51d3c1128d934f2aa83fa6a94c6f9f5650c192f3d480103a"

RPROVIDES:${PN} += "kubernetes-kubelet-common \
kubernetes1.21-kubelet-common"

RDEPENDS:${PN} += "/bin/sh \
cri-runtime \
kubernetes-kubelet1.21"

inherit rpm
