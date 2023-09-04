SUMMARY = "Kubernetes apiserver for container image"
DESCRIPTION = "This subpackage contains the kube-apiserver binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.27.4"

RPM_NAME = "kubernetes1.27-apiserver-1.27.4-2.1.aarch64.rpm"
RPM_HASH = "374a96735101efc586b90b001c766a191c9128cc72a2d1c40492e8ff5da6c949fcc3120472d8e873dfa56b36856e3c252ea2cad9a040b398e89c8a34767adbaa"

RPROVIDES:${PN} += "kubernetes-apiserver-provider \
kubernetes1.27-apiserver"

RDEPENDS:${PN} += ""

inherit rpm
