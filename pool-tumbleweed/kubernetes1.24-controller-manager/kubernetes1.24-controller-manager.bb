SUMMARY = "Kubernetes controller-manager for container image"
DESCRIPTION = "This subpackage contains the kube-controller-manager binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.24.16"

RPM_NAME = "kubernetes1.24-controller-manager-1.24.16-1.1.aarch64.rpm"
RPM_HASH = "9e48422131d3a977b8c95fd795f9c64802fa04727d6ca7355e788587ae52cfd632e18b5e66906ae12e09dd6cffef8b05cc7495b76cc4be77d2f990404adf773b"

RPROVIDES:${PN} += "kubernetes-controller-manager-provider \
kubernetes1.24-controller-manager"

RDEPENDS:${PN} += ""

inherit rpm
