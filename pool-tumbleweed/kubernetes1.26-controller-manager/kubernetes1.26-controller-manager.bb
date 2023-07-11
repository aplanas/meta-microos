SUMMARY = "Kubernetes controller-manager for container image"
DESCRIPTION = "This subpackage contains the kube-controller-manager binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.26.6"

RPM_NAME = "kubernetes1.26-controller-manager-1.26.6-1.1.aarch64.rpm"
RPM_HASH = "4940d8777c23cd22bed878b9ebebe0ef8a31d565390b2714a915c62e5f794906b774b48ea7bb5808df001d3c6d6e714f90a84ed0a97f72d452554f7ba3d7c4c3"

RPROVIDES:${PN} += "kubernetes-controller-manager-provider \
kubernetes1.26-controller-manager"

RDEPENDS:${PN} += ""

inherit rpm
