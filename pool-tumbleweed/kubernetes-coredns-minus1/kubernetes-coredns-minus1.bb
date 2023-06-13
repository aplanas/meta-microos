SUMMARY = "Kubernetes coredns daemon for container images"
DESCRIPTION = "This subpackage contains the coredns binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.9.3"

RPM_NAME = "kubernetes-coredns-minus1-1.9.3-30.1.aarch64.rpm"
RPM_HASH = "54bdb503de43575be27eb2a1a4e91f5f273d56a6b1a4a61b1361e9c4b69c58e39efc073c28d5ac34f27b345c376c8bf8bc5f3e9e26feab3d645d62e861d578b1"

RPROVIDES:${PN} += "kubernetes-coredns-minus1 \
kubernetes-coredns-minus1(aarch-64)"

RDEPENDS:${PN} += "coredns-for-k8s1.26"

inherit rpm
