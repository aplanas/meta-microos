SUMMARY = "Kubernetes coredns daemon for container images"
DESCRIPTION = "This subpackage contains the coredns binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.9.3"

RPM_NAME = "kubernetes-coredns-minus1-1.9.3-34.1.aarch64.rpm"
RPM_HASH = "88bd9217d053a3321d769f8cb3790ccaf9dc3847f180b1b6ca7a18393cb0ac4d96f3263a0518a070187485544540c06d4d8ecef36623ae2ea7bc5361ab61df4d"

RPROVIDES:${PN} += "kubernetes-coredns-minus1"

RDEPENDS:${PN} += "coredns-for-k8s1.26"

inherit rpm
