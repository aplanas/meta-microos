SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon"
LICENSE = "Apache-2.0"

PV = "1.20.15"

RPM_NAME = "kubernetes1.20-kubelet-common-1.20.15-2.2.aarch64.rpm"
RPM_HASH = "ee5aac90ad261a80f7956cf3fa5b929053f3c4a5a7e6137c85baece3a305ba63a75f66d95857bf84b7bd8d4c9b5dd9b9e07c64a1ddf95f5269bd8800931887fe"

RPROVIDES:${PN} += "kubernetes-kubelet-common \
kubernetes1.20-kubelet-common"

RDEPENDS:${PN} += "/usr/bin/sh \
cri-runtime \
kubernetes-kubelet1.20"

inherit rpm
