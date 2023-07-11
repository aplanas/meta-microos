SUMMARY = "Kubernetes client tools common files"
DESCRIPTION = "Kubernetes client tools common files"
LICENSE = "Apache-2.0"

PV = "1.27.3"

RPM_NAME = "kubernetes1.27-client-common-1.27.3-1.1.aarch64.rpm"
RPM_HASH = "18c1680a45e81ab05808f8463f5751b716d0007f965c9645bee46d868d325e2d3e8872bee82ee768c6b5ca4312c107c8ad38bfdc2a3f7a143cf19f708c075da6"

RPROVIDES:${PN} += "kubernetes-client-common \
kubernetes1.27-client-common"

RDEPENDS:${PN} += "/usr/bin/sh \
kubernetes1.27-client"

inherit rpm
