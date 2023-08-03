SUMMARY = "Kubernetes scheduler for container image"
DESCRIPTION = "This subpackage contains the kube-scheduler binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.24.16"

RPM_NAME = "kubernetes1.24-scheduler-1.24.16-1.1.aarch64.rpm"
RPM_HASH = "d1a9a431950cf86bcdf06e6a7e10b81bfdf5779b26bacee455fc45d2a1101f5dc105254c66ef7cb644e7fdfab8a903e1f5293a3a31c30d91fd5f68e5894d4d21"

RPROVIDES:${PN} += "kubernetes-scheduler-provider \
kubernetes1.24-scheduler"

RDEPENDS:${PN} += ""

inherit rpm
