SUMMARY = "Kubernetes apiserver for container image"
DESCRIPTION = "This subpackage contains the kube-apiserver binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.24.15"

RPM_NAME = "kubernetes1.24-apiserver-1.24.15-2.1.aarch64.rpm"
RPM_HASH = "1347618989c18c552daeebdb24efbc10f9b9db6359c0d62aeb1bec4e0b3c2a67ba68cb95f1bc2b92e7148d693e00c0a8eb802ce6f70c7911c333661d9fcd5d82"

RPROVIDES:${PN} += "kubernetes-apiserver-provider \
kubernetes1.24-apiserver"

RDEPENDS:${PN} += ""

inherit rpm
