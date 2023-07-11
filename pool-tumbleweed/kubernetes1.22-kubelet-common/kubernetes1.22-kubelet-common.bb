SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon"
LICENSE = "Apache-2.0"

PV = "1.22.17"

RPM_NAME = "kubernetes1.22-kubelet-common-1.22.17-2.3.aarch64.rpm"
RPM_HASH = "d7ba299d9c8d8e6f014ef17f4ea3e1cb8248d9e52318e6ba58493d327be51e662030ca07ea0099330999b0424c04f2837aa3958919a6ee5879b69429b19f90c3"

RPROVIDES:${PN} += "kubernetes-kubelet-common \
kubernetes1.22-kubelet-common"

RDEPENDS:${PN} += "/usr/bin/sh \
cri-runtime \
kubernetes-kubelet1.22"

inherit rpm
