SUMMARY = "Kubernetes apiserver for container image"
DESCRIPTION = "This subpackage contains the kube-apiserver binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.25.9"

RPM_NAME = "kubernetes1.25-apiserver-1.25.9-1.2.aarch64.rpm"
RPM_HASH = "b3b6d61f76d0ac96d820deca0143af92e54a7fa1e25ff9d9b8e88a3dad9e5b8fc79375611c9ea302dfe6a1a4fe0d7d7b42d96acbef2bf77851206499029e1786"

RPROVIDES:${PN} += "kubernetes-apiserver-provider \
kubernetes1.25-apiserver"

RDEPENDS:${PN} += ""

inherit rpm
