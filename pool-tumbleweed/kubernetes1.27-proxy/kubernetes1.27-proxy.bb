SUMMARY = "Kubernetes proxy for container image"
DESCRIPTION = "This subpackage contains the kube-proxy binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.27.3"

RPM_NAME = "kubernetes1.27-proxy-1.27.3-1.1.aarch64.rpm"
RPM_HASH = "61cf1602124fa690e10ae0ccfb261f7cc83849047bf9b4841cedc0d2643000aa6d2a9254ab6edf0284f8bd1b0526b4ce13ef06ec4cfc033ccd7b9f96dea39843"

RPROVIDES:${PN} += "kubernetes-proxy-provider \
kubernetes1.27-proxy"

RDEPENDS:${PN} += "conntrack-tools \
ebtables \
ipset \
iptables"

inherit rpm
