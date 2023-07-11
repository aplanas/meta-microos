SUMMARY = "Kubernetes scheduler for container image"
DESCRIPTION = "This subpackage contains the kube-scheduler binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.24.15"

RPM_NAME = "kubernetes1.24-scheduler-1.24.15-2.1.aarch64.rpm"
RPM_HASH = "8b089ba546e9b9504744d3f0d68070b726c3774077d4a7a57c797265fe4b12559d6a4cad41d3bd88ccab41ac28f5fa7f682186cb45b939d3c026dd994cbae889"

RPROVIDES:${PN} += "kubernetes-scheduler-provider \
kubernetes1.24-scheduler"

RDEPENDS:${PN} += ""

inherit rpm
