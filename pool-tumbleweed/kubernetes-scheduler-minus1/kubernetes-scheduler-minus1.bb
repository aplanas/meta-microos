SUMMARY = "Kubernetes scheduler for container image"
DESCRIPTION = "This subpackage contains the kube-scheduler binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.26.7"

RPM_NAME = "kubernetes-scheduler-minus1-1.26.7-33.1.aarch64.rpm"
RPM_HASH = "7cc648a46a6f57233b90486f133897f3e781666a042944301dcd092d2578e9ddb722eb583e00abc09057d4ce9e66693e8f6271ccc6e505a2b05cf4178af118fa"

RPROVIDES:${PN} += "kubernetes-scheduler-minus1"

RDEPENDS:${PN} += "kubernetes1.26-scheduler"

inherit rpm
