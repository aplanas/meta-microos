SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon"
LICENSE = "Apache-2.0"

PV = "1.27.3"

RPM_NAME = "kubernetes1.27-kubelet-common-1.27.3-1.1.aarch64.rpm"
RPM_HASH = "fd721cb2774cfe55b22de3ae767e3ab85ccffcde2343ce7dcb37322e889d831d64fe6857b07c0e77926610f2f461487df8668707b80f02120a519716b0a44489"

RPROVIDES:${PN} += "kubernetes-kubelet-common \
kubernetes1.27-kubelet-common"

RDEPENDS:${PN} += "/usr/bin/sh \
cri-runtime \
kubernetes-kubelet1.27"

inherit rpm
