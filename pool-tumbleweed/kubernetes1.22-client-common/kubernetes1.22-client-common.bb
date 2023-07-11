SUMMARY = "Kubernetes client tools common files"
DESCRIPTION = "Kubernetes client tools common files"
LICENSE = "Apache-2.0"

PV = "1.22.17"

RPM_NAME = "kubernetes1.22-client-common-1.22.17-2.3.aarch64.rpm"
RPM_HASH = "f1f11b9013461f18f966d001ce6890057b6e24bf92f352d3103366d01ec9418372fa9ff1bcdcf10bfd3cd6744a49ab2a924311cabd8c7f976ac2e4398c947649"

RPROVIDES:${PN} += "kubernetes-client-common \
kubernetes1.22-client-common"

RDEPENDS:${PN} += "/usr/bin/sh \
kubernetes1.22-client"

inherit rpm
