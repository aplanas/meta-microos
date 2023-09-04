SUMMARY = "Kubernetes controller-manager for container image"
DESCRIPTION = "This subpackage contains the kube-controller-manager binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.25.12"

RPM_NAME = "kubernetes-controller-manager-minus2-1.25.12-34.1.aarch64.rpm"
RPM_HASH = "18d1ffc1445624ecfce4a1658d84b0de532441e0f4243b46ec17a283fe0da0f89bb708009837757db24d832d6a214df9add6070a3ed134c4b3703fdcd656e60a"

RPROVIDES:${PN} += "kubernetes-controller-manager-minus2"

RDEPENDS:${PN} += "kubernetes1.25-controller-manager"

inherit rpm
