SUMMARY = "Kubernetes proxy for container image"
DESCRIPTION = "This subpackage contains the kube-proxy binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.26.7"

RPM_NAME = "kubernetes-proxy-minus1-1.26.7-34.1.aarch64.rpm"
RPM_HASH = "955c2af7162555ac78eee4934540a1dbba81fb0f5bef4b36ca02ffe93541478fb27b1a3d01cdab276abe7ca8a580c7a8eef68f8ff8358f350080f7c8edaf60e0"

RPROVIDES:${PN} += "kubernetes-proxy-minus1"

RDEPENDS:${PN} += "kubernetes1.26-proxy"

inherit rpm
