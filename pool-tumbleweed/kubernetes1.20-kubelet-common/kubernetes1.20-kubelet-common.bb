SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon"
LICENSE = "Apache-2.0"

PV = "1.20.15"

RPM_NAME = "kubernetes1.20-kubelet-common-1.20.15-2.3.aarch64.rpm"
RPM_HASH = "8c1d38a60b511d8b5d504ef7740fd7efdc8a39f2f9614534987b9ef57b01ff4867165e16b785add7e5d0b5d0ce70d6cd441e825c48b22692229e7066db6b7956"

RPROVIDES:${PN} += "kubernetes-kubelet-common \
kubernetes1.20-kubelet-common"

RDEPENDS:${PN} += "/usr/bin/sh \
cri-runtime \
kubernetes-kubelet1.20"

inherit rpm
