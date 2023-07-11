SUMMARY = "Kubernetes client tools common files"
DESCRIPTION = "Kubernetes client tools common files"
LICENSE = "Apache-2.0"

PV = "1.20.15"

RPM_NAME = "kubernetes1.20-client-common-1.20.15-2.3.aarch64.rpm"
RPM_HASH = "6d9cc95465208e4bf1717943d5dd84ecfede8c144718ac7f1aed3b517d7abd6b67e506d6e2714253f157d86828334d7a14ccaffa33725ab80a1828eb79629083"

RPROVIDES:${PN} += "kubernetes-client-common \
kubernetes1.20-client-common"

RDEPENDS:${PN} += "/usr/bin/sh \
kubernetes1.20-client"

inherit rpm
