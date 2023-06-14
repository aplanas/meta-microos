SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon"
LICENSE = "Apache-2.0"

PV = "1.26.4"

RPM_NAME = "kubernetes1.26-kubelet-common-1.26.4-1.2.aarch64.rpm"
RPM_HASH = "d2e10df2ccd8c3ba4c27191bdee979049b11f786b21bf243ef3139b6815c242fd9e87dbca04841b0bc0d7099b4a4a245151e7a1e5351a1d223b54641c9b8c672"

RPROVIDES:${PN} += "kubernetes-kubelet-common \
kubernetes1.26-kubelet-common"

RDEPENDS:${PN} += "/bin/sh \
cri-runtime \
kubernetes-kubelet1.26"

inherit rpm
