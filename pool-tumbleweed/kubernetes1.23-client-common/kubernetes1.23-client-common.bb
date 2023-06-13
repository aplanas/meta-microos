SUMMARY = "Kubernetes client tools common files"
DESCRIPTION = "Kubernetes client tools common files"
LICENSE = "Apache-2.0"

PV = "1.23.17"

RPM_NAME = "kubernetes1.23-client-common-1.23.17-3.1.aarch64.rpm"
RPM_HASH = "dd4d23a5e22d3925f060303130c63f1fcfdcccc24b9bbeea71901dd2625a11a0316ceab2a6b390a6c06882186a1843cac0e4797da3cf0fb21b217e76c74e91cf"

RPROVIDES:${PN} += "kubernetes-client-common \
kubernetes1.23-client-common \
kubernetes1.23-client-common(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
kubernetes1.23-client"

inherit rpm
