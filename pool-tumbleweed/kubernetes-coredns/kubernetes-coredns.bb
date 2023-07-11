SUMMARY = "Kubernetes coredns daemon for container images"
DESCRIPTION = "This subpackage contains the coredns binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.10.1"

RPM_NAME = "kubernetes-coredns-1.10.1-32.1.aarch64.rpm"
RPM_HASH = "c63ecb407f85d007381abaad2a2677b40e6cf1e74044f6830bd77a15ffd43231c6f690e5707dc7415d3485cfe66620378f243994705e58cebbc8a7369fa50f30"

RPROVIDES:${PN} += "kubernetes-coredns"

RDEPENDS:${PN} += "coredns-for-k8s1.27"

inherit rpm
