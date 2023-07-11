SUMMARY = "Kubernetes scheduler for container image"
DESCRIPTION = "This subpackage contains the kube-scheduler binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.25.11"

RPM_NAME = "kubernetes1.25-scheduler-1.25.11-1.1.aarch64.rpm"
RPM_HASH = "645170bd356e0e2cf5503d3d80b495f6ece3c9b3cd9a63817c09209201316bc8296932657c363f901b27770310e62a2ac5fd7bb6d9082f0eda520a4586eb427b"

RPROVIDES:${PN} += "kubernetes-scheduler-provider \
kubernetes1.25-scheduler"

RDEPENDS:${PN} += ""

inherit rpm
