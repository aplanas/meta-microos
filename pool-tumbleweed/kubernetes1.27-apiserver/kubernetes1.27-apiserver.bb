SUMMARY = "Kubernetes apiserver for container image"
DESCRIPTION = "This subpackage contains the kube-apiserver binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.27.3"

RPM_NAME = "kubernetes1.27-apiserver-1.27.3-1.1.aarch64.rpm"
RPM_HASH = "dbcfd2641a93445395a43252d00677a102fc29915d5b2181b33aca8bee9f6d9ec2ce9d00babd5938c25cec337f7c97a55442ff8bd588897642bb365cd1b0cb9e"

RPROVIDES:${PN} += "kubernetes-apiserver-provider \
kubernetes1.27-apiserver"

RDEPENDS:${PN} += ""

inherit rpm
