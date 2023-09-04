SUMMARY = "Kubernetes controller-manager for container image"
DESCRIPTION = "This subpackage contains the kube-controller-manager binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.24.16"

RPM_NAME = "kubernetes-controller-manager-minus3-1.24.16-34.1.aarch64.rpm"
RPM_HASH = "29a5daf8315d75f1f9ae914af9dada37dc06c2fb60079f7bed7b01c204342d30eb33bfdb199f09099167d68878ec636a4eb24f0ac689ac0043443735433042ce"

RPROVIDES:${PN} += "kubernetes-controller-manager-minus3"

RDEPENDS:${PN} += "kubernetes1.24-controller-manager"

inherit rpm
