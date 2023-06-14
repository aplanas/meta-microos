SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon"
LICENSE = "Apache-2.0"

PV = "1.25.9"

RPM_NAME = "kubernetes1.25-kubelet-common-1.25.9-1.2.aarch64.rpm"
RPM_HASH = "3dae1159b7c5430efda4f368e7d63740486f30c7959205788dca334d3e89f62c9946fe4f8ebcdf6a5c6d92722e5960481eb64bdd5b3a9cf8dcd5ffe03b770e10"

RPROVIDES:${PN} += "kubernetes-kubelet-common \
kubernetes1.25-kubelet-common"

RDEPENDS:${PN} += "/bin/sh \
cri-runtime \
kubernetes-kubelet1.25"

inherit rpm
