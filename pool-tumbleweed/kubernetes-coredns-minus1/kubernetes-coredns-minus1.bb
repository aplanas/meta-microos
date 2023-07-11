SUMMARY = "Kubernetes coredns daemon for container images"
DESCRIPTION = "This subpackage contains the coredns binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.9.3"

RPM_NAME = "kubernetes-coredns-minus1-1.9.3-32.1.aarch64.rpm"
RPM_HASH = "790b30e36ee8e5989d55d11010a15455f1528c89fd112296f800632f257acb743d4b855967484d4a7a008e2a390d95beec1c8e2ed68cd24d5bf15768206fb147"

RPROVIDES:${PN} += "kubernetes-coredns-minus1"

RDEPENDS:${PN} += "coredns-for-k8s1.26"

inherit rpm
