SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon"
LICENSE = "Apache-2.0"

PV = "1.27.4"

RPM_NAME = "kubernetes1.27-kubelet-common-1.27.4-2.1.aarch64.rpm"
RPM_HASH = "312684e700cb22ee5c8ed4128e197318953c48add623e5597b048b45b5d9de187e87653652d968cccf9f50aca92f9e77b0c18e80913b4b36d8e83f021813d57e"

RPROVIDES:${PN} += "kubernetes-kubelet-common \
kubernetes1.27-kubelet-common"

RDEPENDS:${PN} += "/usr/bin/sh \
cri-runtime \
kubernetes-kubelet1.27"

inherit rpm
