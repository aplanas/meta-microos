SUMMARY = "Kubernetes client tools common files"
DESCRIPTION = "Kubernetes client tools common files"
LICENSE = "Apache-2.0"

PV = "1.27.4"

RPM_NAME = "kubernetes1.27-client-common-1.27.4-1.1.aarch64.rpm"
RPM_HASH = "ef02189e8bdf780bdd1e70f7d3a50a16d1c7b05bfb8a846b1a9d73b7687657e46e4022dbedf8040c18b6ea70780bbd8c357ace8e113701e314a109c09b08464a"

RPROVIDES:${PN} += "kubernetes-client-common \
kubernetes1.27-client-common"

RDEPENDS:${PN} += "/usr/bin/sh \
kubernetes1.27-client"

inherit rpm
