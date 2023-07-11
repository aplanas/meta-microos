SUMMARY = "Kubernetes scheduler for container image"
DESCRIPTION = "This subpackage contains the kube-scheduler binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.26.6"

RPM_NAME = "kubernetes-scheduler-minus1-1.26.6-32.1.aarch64.rpm"
RPM_HASH = "ee599f4040c996cf262eb0ab03774f94d3ad6d9820dfca0e809408922d8d55fe81cc8a228ea0b41ab3ca2a78bb6e965cbc328b47c9de1c8103a4d7706426b91f"

RPROVIDES:${PN} += "kubernetes-scheduler-minus1"

RDEPENDS:${PN} += "kubernetes1.26-scheduler"

inherit rpm
