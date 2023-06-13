SUMMARY = "Kubernetes controller-manager for container image"
DESCRIPTION = "This subpackage contains the kube-controller-manager binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.21.14"

RPM_NAME = "kubernetes1.21-controller-manager-1.21.14-2.2.aarch64.rpm"
RPM_HASH = "4e16d5860a7d3e3ded83ce12d5162d58a26078a99f070a4da086229bf25d102ebc95e8c58493dce265107456b1c47991bbe40bf8f1338dbb47de44320ee9b546"

RPROVIDES:${PN} += "kubernetes-controller-manager-provider \
kubernetes1.21-controller-manager \
kubernetes1.21-controller-manager(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
