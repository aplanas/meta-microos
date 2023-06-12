SUMMARY = "Kubernetes apiserver for container image"
DESCRIPTION = "This subpackage contains the kube-apiserver binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.21.14"

RPM_NAME = "kubernetes1.21-apiserver-1.21.14-2.2.aarch64.rpm"
RPM_HASH = "78664bbcfbe7ebfe7a7ce2d8db2858735fcc9b3753def512f586e09fef980d7a4bef3a844f8ca9826a598bbe5b9325ab01dae0080d12d8253e12eba5ae486cef"

RPROVIDES:${PN} += "kubernetes-apiserver-provider \
kubernetes1.21-apiserver \
kubernetes1.21-apiserver(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
