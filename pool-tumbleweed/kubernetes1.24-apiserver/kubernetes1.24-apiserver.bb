SUMMARY = "Kubernetes apiserver for container image"
DESCRIPTION = "This subpackage contains the kube-apiserver binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.24.16"

RPM_NAME = "kubernetes1.24-apiserver-1.24.16-1.1.aarch64.rpm"
RPM_HASH = "ed739b22dd8bd1152f8b936fbb19da686238ce0e2a7a0e26606e557d4f8a3e466f87bf146f5351d33f4ea6a75635777010caf4014102a72ea1bea83890ae2fa4"

RPROVIDES:${PN} += "kubernetes-apiserver-provider \
kubernetes1.24-apiserver"

RDEPENDS:${PN} += ""

inherit rpm
