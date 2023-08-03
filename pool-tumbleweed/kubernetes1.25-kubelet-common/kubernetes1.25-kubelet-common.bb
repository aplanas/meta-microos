SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon"
LICENSE = "Apache-2.0"

PV = "1.25.12"

RPM_NAME = "kubernetes1.25-kubelet-common-1.25.12-1.1.aarch64.rpm"
RPM_HASH = "8faa9de01eac217e5d7720b81774846b5a77a92b214f35fe51b58c7238158b8e2130fe4b00d44e6679aa91e8e019792a7ed2884ab04fe80f505fa0a01c367df6"

RPROVIDES:${PN} += "kubernetes-kubelet-common \
kubernetes1.25-kubelet-common"

RDEPENDS:${PN} += "/usr/bin/sh \
cri-runtime \
kubernetes-kubelet1.25"

inherit rpm
