SUMMARY = "Kubernetes proxy for container image"
DESCRIPTION = "This subpackage contains the kube-proxy binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.27.3"

RPM_NAME = "kubernetes-proxy-1.27.3-32.1.aarch64.rpm"
RPM_HASH = "ef546bda35953ffad151b8abbd55cdd5a0cc2d94fbfe39013ae3a7f7105a0ffa7b4d7f85b1eb531b640bd783438214094c94210ba499f19d080b7481da271515"

RPROVIDES:${PN} += "kubernetes-proxy"

RDEPENDS:${PN} += "kubernetes1.27-proxy"

inherit rpm
