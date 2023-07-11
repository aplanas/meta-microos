SUMMARY = "Kubernetes proxy for container image"
DESCRIPTION = "This subpackage contains the kube-proxy binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.20.15"

RPM_NAME = "kubernetes1.20-proxy-1.20.15-2.3.aarch64.rpm"
RPM_HASH = "c0ca96f2330bdde338fae7e1d7a082d80f368c3d301db6102f95d0cce904f41c2be1ca03fab24c61197b8289c0be5b0ddeb80683339fa9521139bff6f5573a0e"

RPROVIDES:${PN} += "kubernetes-proxy-provider \
kubernetes1.20-proxy"

RDEPENDS:${PN} += "conntrack-tools \
ebtables \
ipset \
iptables"

inherit rpm
