SUMMARY = "Kubernetes client tools common files"
DESCRIPTION = "Kubernetes client tools common files"
LICENSE = "Apache-2.0"

PV = "1.26.6"

RPM_NAME = "kubernetes1.26-client-common-1.26.6-1.1.aarch64.rpm"
RPM_HASH = "60a46f8c36dd10b414cf0d0b342f92a8addc89807aad40ba17df2125a074ce81067d16e52ce4875d0c15fe47862396314dc0b519966f744f58f3444833b4efd7"

RPROVIDES:${PN} += "kubernetes-client-common \
kubernetes1.26-client-common"

RDEPENDS:${PN} += "/usr/bin/sh \
kubernetes1.26-client"

inherit rpm
