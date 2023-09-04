SUMMARY = "Kubernetes coredns daemon for container images"
DESCRIPTION = "This subpackage contains the coredns binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.8.6"

RPM_NAME = "kubernetes-coredns-minus3-1.8.6-34.1.aarch64.rpm"
RPM_HASH = "3ce26b7d6964d3f069b6f4f35f1272088cca4ac6ae856694342b8ef61a81459679d17b64943786403002e5a7ea352728c16bd7779e2e30e8946f3a95c009033b"

RPROVIDES:${PN} += "kubernetes-coredns-minus3"

RDEPENDS:${PN} += "coredns-for-k8s1.24"

inherit rpm
