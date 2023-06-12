SUMMARY = "Kubernetes controller-manager for container image"
DESCRIPTION = "This subpackage contains the kube-controller-manager binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.27.1"

RPM_NAME = "kubernetes1.27-controller-manager-1.27.1-1.2.aarch64.rpm"
RPM_HASH = "810362e99ac3bcce43371d3fddf7e13a47a04321c1a77953bc3c1387e549b00b2c6810da89e8ff8a87f9c8c8a71e3ea50ebeb7e211047e3efde0448e11bde6f3"

RPROVIDES:${PN} += "kubernetes-controller-manager-provider \
kubernetes1.27-controller-manager \
kubernetes1.27-controller-manager(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
