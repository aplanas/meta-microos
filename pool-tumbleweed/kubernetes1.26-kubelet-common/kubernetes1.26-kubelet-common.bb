SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon"
LICENSE = "Apache-2.0"

PV = "1.26.7"

RPM_NAME = "kubernetes1.26-kubelet-common-1.26.7-1.1.aarch64.rpm"
RPM_HASH = "2d599e09e68756f4126a6c7fde7847cbbe6042e2144f6a004fddafefed338314137b6a782158d0c4d1b34d059bb81df7d60daf7fef353bbfed53a006904656bf"

RPROVIDES:${PN} += "kubernetes-kubelet-common \
kubernetes1.26-kubelet-common"

RDEPENDS:${PN} += "/usr/bin/sh \
cri-runtime \
kubernetes-kubelet1.26"

inherit rpm
