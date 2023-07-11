SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon"
LICENSE = "Apache-2.0"

PV = "1.25.11"

RPM_NAME = "kubernetes1.25-kubelet-common-1.25.11-1.1.aarch64.rpm"
RPM_HASH = "16fbdd2d8190dde2c4e65adf30e264b7ba8bcf0f1a57ee180b831059fb16ffb7b2bb664b6f94fb9aaf54024cb1c43373a63b6aa032495d38005be973ec7e5de0"

RPROVIDES:${PN} += "kubernetes-kubelet-common \
kubernetes1.25-kubelet-common"

RDEPENDS:${PN} += "/usr/bin/sh \
cri-runtime \
kubernetes-kubelet1.25"

inherit rpm
