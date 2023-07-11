SUMMARY = "Kubernetes apiserver for container image"
DESCRIPTION = "This subpackage contains the kube-apiserver binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.21.14"

RPM_NAME = "kubernetes1.21-apiserver-1.21.14-2.3.aarch64.rpm"
RPM_HASH = "c6477a31e62c5cd45644b2c6c7ab3401da069a2678da27ad4800e0c2499a9768e694d14a149c346575f7413498742ad0ed3101d5ce0c909126077fe95f41d232"

RPROVIDES:${PN} += "kubernetes-apiserver-provider \
kubernetes1.21-apiserver"

RDEPENDS:${PN} += ""

inherit rpm
