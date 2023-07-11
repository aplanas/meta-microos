SUMMARY = "Kubernetes apiserver for container image"
DESCRIPTION = "This subpackage contains the kube-apiserver binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.20.15"

RPM_NAME = "kubernetes1.20-apiserver-1.20.15-2.3.aarch64.rpm"
RPM_HASH = "0a75c3fdc903b124b15dd4578ce524c525c224b76e57e2943ea7d4e2958b6671db5ee880a5f9cd975996bae6e10795396b26fc93482fcae7a72aef74d4c9c36d"

RPROVIDES:${PN} += "kubernetes-apiserver-provider \
kubernetes1.20-apiserver"

RDEPENDS:${PN} += ""

inherit rpm
