SUMMARY = "Kubernetes client tools common files"
DESCRIPTION = "Kubernetes client tools common files"
LICENSE = "Apache-2.0"

PV = "1.24.13"

RPM_NAME = "kubernetes1.24-client-common-1.24.13-2.2.aarch64.rpm"
RPM_HASH = "950e7a6904ed8e7e38bde0533831f3c384f9c637c19ea25dff4d86fcf26cd55a763e8e99f05a0c2e254e61d79fa9349151dbb667e98499af606d024c2f6aa066"

RPROVIDES:${PN} += "kubernetes-client-common \
kubernetes1.24-client-common"

RDEPENDS:${PN} += "/usr/bin/sh \
kubernetes1.24-client"

inherit rpm
