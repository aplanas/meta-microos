SUMMARY = "Kubernetes proxy for container image"
DESCRIPTION = "This subpackage contains the kube-proxy binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.26.7"

RPM_NAME = "kubernetes-proxy-minus1-1.26.7-33.1.aarch64.rpm"
RPM_HASH = "017cb96928b2c4f3c94f598fc8727fbee87723986f4ad96aaf34abd5ab35c45f770dd3e89b6a1e1c7e9a244f6035a13dadebcf0ecfe1e6c856f0a8fb79266bd1"

RPROVIDES:${PN} += "kubernetes-proxy-minus1"

RDEPENDS:${PN} += "kubernetes1.26-proxy"

inherit rpm
