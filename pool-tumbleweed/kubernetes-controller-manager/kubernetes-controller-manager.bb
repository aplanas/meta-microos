SUMMARY = "Kubernetes controller-manager for container image"
DESCRIPTION = "This subpackage contains the kube-controller-manager binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.27.1"

RPM_NAME = "kubernetes-controller-manager-1.27.1-30.1.aarch64.rpm"
RPM_HASH = "a2dfcf29e38bae637ba14e23f728eeefdadc7de7eacf66a65fdbc499ba6985605248eb6374d5b00286522f7f7e33bc4f5e0fb7dad3cc2d6bbda6c8d633cc4c80"

RPROVIDES:${PN} += "kubernetes-controller-manager \
kubernetes-controller-manager(aarch-64)"
RDEPENDS:${PN} += "kubernetes1.27-controller-manager"

inherit rpm
