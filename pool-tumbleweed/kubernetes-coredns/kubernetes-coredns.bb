SUMMARY = "Kubernetes coredns daemon for container images"
DESCRIPTION = "This subpackage contains the coredns binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.10.1"

RPM_NAME = "kubernetes-coredns-1.10.1-34.1.aarch64.rpm"
RPM_HASH = "fbb3eb2404cb33b3c9932df27e91cdbf0c2f03adc28febb7c453eed55b99694b6ab7e25ae200fd355403cab93e5214fdb93cede0c1cc5519ec4da1e00686e481"

RPROVIDES:${PN} += "kubernetes-coredns"

RDEPENDS:${PN} += "coredns-for-k8s1.27"

inherit rpm
