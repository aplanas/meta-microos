SUMMARY = "Kubernetes proxy for container image"
DESCRIPTION = "This subpackage contains the kube-proxy binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.27.4"

RPM_NAME = "kubernetes-proxy-1.27.4-34.1.aarch64.rpm"
RPM_HASH = "111bad6c1068469da3b678d11aad4f387a0b4af62e1ece6e2b9a3ed18cd58de30b726d7d8a62527c77e2165de16a175c2c5779d38eeb620d483097d52b17c871"

RPROVIDES:${PN} += "kubernetes-proxy"

RDEPENDS:${PN} += "kubernetes1.27-proxy"

inherit rpm
