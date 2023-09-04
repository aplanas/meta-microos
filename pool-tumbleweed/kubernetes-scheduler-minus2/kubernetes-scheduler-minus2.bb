SUMMARY = "Kubernetes scheduler for container image"
DESCRIPTION = "This subpackage contains the kube-scheduler binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.25.12"

RPM_NAME = "kubernetes-scheduler-minus2-1.25.12-34.1.aarch64.rpm"
RPM_HASH = "9012eb2b955cf9b3278572f2069fcc52e335891dd8c021143d48abd73cebd6272d3c639aa00cc5e2483be5cd467cf524e89b3e0294a975da49793630803d7ab2"

RPROVIDES:${PN} += "kubernetes-scheduler-minus2"

RDEPENDS:${PN} += "kubernetes1.25-scheduler"

inherit rpm
