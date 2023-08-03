SUMMARY = "Kubernetes apiserver for container image"
DESCRIPTION = "This subpackage contains the kube-apiserver binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.27.4"

RPM_NAME = "kubernetes1.27-apiserver-1.27.4-1.1.aarch64.rpm"
RPM_HASH = "3e7e399bdc8aede2de3bacc3ea0a36a5bc28d2ddb9aee5c3230d667585b7aae4c8d11fb9c0746be16a864b053ec7f9ac7b8dedf929a85346895edfad65e13e68"

RPROVIDES:${PN} += "kubernetes-apiserver-provider \
kubernetes1.27-apiserver"

RDEPENDS:${PN} += ""

inherit rpm
