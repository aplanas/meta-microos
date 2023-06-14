SUMMARY = "Kubernetes controller-manager for container image"
DESCRIPTION = "This subpackage contains the kube-controller-manager binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.20.15"

RPM_NAME = "kubernetes1.20-controller-manager-1.20.15-2.2.aarch64.rpm"
RPM_HASH = "98252ee4de1998eb335407e9202517ab7671d3da5ef93c6ad98c50081200ae9dcbcf01ec1e488fe791054d827f2d91e42b7eb7378bc0bd04b299bc61b0db1efb"

RPROVIDES:${PN} += "kubernetes-controller-manager-provider \
kubernetes1.20-controller-manager"

RDEPENDS:${PN} += ""

inherit rpm
