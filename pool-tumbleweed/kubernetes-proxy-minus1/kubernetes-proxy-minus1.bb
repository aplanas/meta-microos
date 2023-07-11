SUMMARY = "Kubernetes proxy for container image"
DESCRIPTION = "This subpackage contains the kube-proxy binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.26.6"

RPM_NAME = "kubernetes-proxy-minus1-1.26.6-32.1.aarch64.rpm"
RPM_HASH = "26a8d5698a47cae7e64413bd8c229cb329ad3193d74f9869ab574037d6a4ca1f619772c4a7cc2021bc335e7ed2bbd198cbd0172b5844e53c2a9d70e6b3d85430"

RPROVIDES:${PN} += "kubernetes-proxy-minus1"

RDEPENDS:${PN} += "kubernetes1.26-proxy"

inherit rpm
