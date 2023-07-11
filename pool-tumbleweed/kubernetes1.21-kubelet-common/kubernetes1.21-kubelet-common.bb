SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon"
LICENSE = "Apache-2.0"

PV = "1.21.14"

RPM_NAME = "kubernetes1.21-kubelet-common-1.21.14-2.3.aarch64.rpm"
RPM_HASH = "0cd6c80ffbfb028cd1d12f35a2117bdfab262126929f4295e9355569434c26ef1d147ccc79f3b917831042f5cd2f45bdb1014363578e54ec930dda9718f309a4"

RPROVIDES:${PN} += "kubernetes-kubelet-common \
kubernetes1.21-kubelet-common"

RDEPENDS:${PN} += "/usr/bin/sh \
cri-runtime \
kubernetes-kubelet1.21"

inherit rpm
