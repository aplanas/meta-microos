SUMMARY = "Kubernetes proxy for container image"
DESCRIPTION = "This subpackage contains the kube-proxy binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.24.15"

RPM_NAME = "kubernetes1.24-proxy-1.24.15-2.1.aarch64.rpm"
RPM_HASH = "b210d061d3d49cf6477de20eb449d1f3572fc979b0dda30696938c106121418126db44ede60c4b99ce4cd8633de092b4b8cdbc9b6226997bfdb15a5e59d41d05"

RPROVIDES:${PN} += "kubernetes-proxy-provider \
kubernetes1.24-proxy"

RDEPENDS:${PN} += "conntrack-tools \
ebtables \
ipset \
iptables"

inherit rpm
