SUMMARY = "Kubernetes client tools common files"
DESCRIPTION = "Kubernetes client tools common files"
LICENSE = "Apache-2.0"

PV = "1.23.17"

RPM_NAME = "kubernetes1.23-client-common-1.23.17-5.1.aarch64.rpm"
RPM_HASH = "7ecfedcbd591a27a6fe93bb814030f685b56d7137ad7f9abd88b8082f49f7b9591df0cd952133845a1ddcb1d38cbb114afc71fad4195c5063224adfa5da91809"

RPROVIDES:${PN} += "kubernetes-client-common \
kubernetes1.23-client-common"

RDEPENDS:${PN} += "/usr/bin/sh \
kubernetes1.23-client"

inherit rpm
