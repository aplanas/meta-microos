SUMMARY = "Kubernetes scheduler for container image"
DESCRIPTION = "This subpackage contains the kube-scheduler binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.20.15"

RPM_NAME = "kubernetes1.20-scheduler-1.20.15-2.3.aarch64.rpm"
RPM_HASH = "58247193ecbbc5fc431e8b0deaaa663225d84745ddb9158cc69ab5fb758e602b043a8883ca9090591781b4b6e346219f160f6b260195eb9747fcfada52ab54e9"

RPROVIDES:${PN} += "kubernetes-scheduler-provider \
kubernetes1.20-scheduler"

RDEPENDS:${PN} += ""

inherit rpm
