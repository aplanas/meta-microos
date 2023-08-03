SUMMARY = "Kubernetes client tools common files"
DESCRIPTION = "Kubernetes client tools common files"
LICENSE = "Apache-2.0"

PV = "1.25.12"

RPM_NAME = "kubernetes1.25-client-common-1.25.12-1.1.aarch64.rpm"
RPM_HASH = "37fcbe3a38786cadb2b5f4bb29a86ccae8d5cf76b43161f973bbc78411e9005f203cdda05301d381b12316dd6ce21be11da0529e67bfa0a47ff4ab9a54dc4775"

RPROVIDES:${PN} += "kubernetes-client-common \
kubernetes1.25-client-common"

RDEPENDS:${PN} += "/usr/bin/sh \
kubernetes1.25-client"

inherit rpm
