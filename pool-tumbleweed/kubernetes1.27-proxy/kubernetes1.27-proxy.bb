SUMMARY = "Kubernetes proxy for container image"
DESCRIPTION = "This subpackage contains the kube-proxy binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.27.4"

RPM_NAME = "kubernetes1.27-proxy-1.27.4-2.1.aarch64.rpm"
RPM_HASH = "2de1289917f9bae9a93fe806d2412af6d39fed73f88da32bc386fc78e6fc8dfcb1b2d9bd28b14201be1d5473abb72bc62a9fc1c3595895a4df7ea197bb4f6062"

RPROVIDES:${PN} += "kubernetes-proxy-provider \
kubernetes1.27-proxy"

RDEPENDS:${PN} += "conntrack-tools \
ebtables \
ipset \
iptables"

inherit rpm
