SUMMARY = "Kubernetes coredns daemon for container images"
DESCRIPTION = "This subpackage contains the coredns binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.10.1"

RPM_NAME = "kubernetes-coredns-1.10.1-30.1.aarch64.rpm"
RPM_HASH = "ef9ac73f75ff369e2ee8b995e7240ad5b32cd12f6492e6889b210e24f7986a2028b1253968716c47434a012f11d7b476e3f863c54e69948c396323804cd2c72c"

RPROVIDES:${PN} += "kubernetes-coredns"

RDEPENDS:${PN} += "coredns-for-k8s1.27"

inherit rpm
