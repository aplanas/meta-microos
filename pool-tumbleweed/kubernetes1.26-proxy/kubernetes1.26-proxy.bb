SUMMARY = "Kubernetes proxy for container image"
DESCRIPTION = "This subpackage contains the kube-proxy binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.26.6"

RPM_NAME = "kubernetes1.26-proxy-1.26.6-1.1.aarch64.rpm"
RPM_HASH = "d262f61419f6f67b89bafbde08c15c5c1778a52953ede86ed88fbba664f2f59eff552ebd34d106cc750144e866d03bd31837e57daed1e7cb605a51bc9ae27e56"

RPROVIDES:${PN} += "kubernetes-proxy-provider \
kubernetes1.26-proxy"

RDEPENDS:${PN} += "conntrack-tools \
ebtables \
ipset \
iptables"

inherit rpm
