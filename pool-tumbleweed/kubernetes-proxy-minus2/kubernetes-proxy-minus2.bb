SUMMARY = "Kubernetes proxy for container image"
DESCRIPTION = "This subpackage contains the kube-proxy binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.25.12"

RPM_NAME = "kubernetes-proxy-minus2-1.25.12-34.1.aarch64.rpm"
RPM_HASH = "738f68f451e400b4a66b197fe123bc11d79cbbc31799f3f8fc53eb4dd1f6b7a281e206c01962a43711a7de74613ca72f117fb1d82d0a061a2c6f27b38a5fd413"

RPROVIDES:${PN} += "kubernetes-proxy-minus2"

RDEPENDS:${PN} += "kubernetes1.25-proxy"

inherit rpm
