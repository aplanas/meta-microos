SUMMARY = "Kubernetes client tools common files"
DESCRIPTION = "Kubernetes client tools common files"
LICENSE = "Apache-2.0"

PV = "1.21.14"

RPM_NAME = "kubernetes1.21-client-common-1.21.14-2.2.aarch64.rpm"
RPM_HASH = "662383b2188831ec8b26c720eca4a3cc757376c2f13222ba42879afda492886d3f3aea2eea97e3f9f7ef8a2ce16e1d034000af06fca2ab10d7257a704be81433"

RPROVIDES:${PN} += "kubernetes-client-common \
kubernetes1.21-client-common"

RDEPENDS:${PN} += "/bin/sh \
kubernetes1.21-client"

inherit rpm
