SUMMARY = "Kubernetes controller-manager for container image"
DESCRIPTION = "This subpackage contains the kube-controller-manager binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.27.4"

RPM_NAME = "kubernetes-controller-manager-1.27.4-34.1.aarch64.rpm"
RPM_HASH = "d72acf2c94706c097b12917f078ee42615eac96d0356759682891c97ce567db171107f2417e26ab7846701f2b702599352f75b108d77b7897ee42a68d5b25a97"

RPROVIDES:${PN} += "kubernetes-controller-manager"

RDEPENDS:${PN} += "kubernetes1.27-controller-manager"

inherit rpm
