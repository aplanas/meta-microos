SUMMARY = "Kubernetes proxy for container image"
DESCRIPTION = "This subpackage contains the kube-proxy binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.26.4"

RPM_NAME = "kubernetes-proxy-minus1-1.26.4-30.1.aarch64.rpm"
RPM_HASH = "f61defaad380e642f19f9cecc4a7f7d5e77bc15d11abbd19488ae85c89cb5d829c16ac7bcec44b4b63a028a37b765e87a77aa16345450869b5677010ac3c0a61"

RPROVIDES:${PN} += "kubernetes-proxy-minus1 \
kubernetes-proxy-minus1(aarch-64)"

RDEPENDS:${PN} += "kubernetes1.26-proxy"

inherit rpm
