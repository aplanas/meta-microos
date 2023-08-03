SUMMARY = "Kubernetes coredns daemon for container images"
DESCRIPTION = "This subpackage contains the coredns binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.9.3"

RPM_NAME = "kubernetes-coredns-minus1-1.9.3-33.1.aarch64.rpm"
RPM_HASH = "f0844d1916b4c0240b133105de98075f8fdfc7dc615c91fb25379981f4c539490d6c49c45f3afc2323cd4489782db733df5d0ded6cf274ff1ad29d8a4a1fe4af"

RPROVIDES:${PN} += "kubernetes-coredns-minus1"

RDEPENDS:${PN} += "coredns-for-k8s1.26"

inherit rpm
