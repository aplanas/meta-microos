SUMMARY = "Kubernetes scheduler for container image"
DESCRIPTION = "This subpackage contains the kube-scheduler binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.26.4"

RPM_NAME = "kubernetes1.26-scheduler-1.26.4-1.2.aarch64.rpm"
RPM_HASH = "b54bf6638602ed49719f564f028e632ee711a4c6b37617d2efcc056481ba3835bb7074cb118bf1acbf9f68d2fa4efed2631839e2ee56488e990c344f489ffe47"

RPROVIDES:${PN} += "kubernetes-scheduler-provider \
kubernetes1.26-scheduler"

RDEPENDS:${PN} += ""

inherit rpm
