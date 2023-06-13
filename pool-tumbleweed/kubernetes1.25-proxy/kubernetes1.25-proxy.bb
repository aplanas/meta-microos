SUMMARY = "Kubernetes proxy for container image"
DESCRIPTION = "This subpackage contains the kube-proxy binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.25.9"

RPM_NAME = "kubernetes1.25-proxy-1.25.9-1.2.aarch64.rpm"
RPM_HASH = "ab1f7c2d00bb8aa5005927eef50429a550f9ffe6f3f3381395786fc578d5ed85d22e92388368dc0345cde09e50a7c8629e1f5058e6fad02f03e396d7c45a9360"

RPROVIDES:${PN} += "kubernetes-proxy-provider \
kubernetes1.25-proxy \
kubernetes1.25-proxy(aarch-64)"

RDEPENDS:${PN} += "conntrack-tools \
ebtables \
ipset \
iptables"

inherit rpm
