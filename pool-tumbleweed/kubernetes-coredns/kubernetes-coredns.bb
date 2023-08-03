SUMMARY = "Kubernetes coredns daemon for container images"
DESCRIPTION = "This subpackage contains the coredns binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.10.1"

RPM_NAME = "kubernetes-coredns-1.10.1-33.1.aarch64.rpm"
RPM_HASH = "c0a3e430e2d547fc49e7169db72d6590a0e97ecced6f88079ccb68b333882724687d931236b170484b717caebbadfd6666272980b0b3b7efbd2a93f7c3d61304"

RPROVIDES:${PN} += "kubernetes-coredns"

RDEPENDS:${PN} += "coredns-for-k8s1.27"

inherit rpm
