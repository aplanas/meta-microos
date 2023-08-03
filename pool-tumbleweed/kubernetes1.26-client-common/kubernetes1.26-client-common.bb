SUMMARY = "Kubernetes client tools common files"
DESCRIPTION = "Kubernetes client tools common files"
LICENSE = "Apache-2.0"

PV = "1.26.7"

RPM_NAME = "kubernetes1.26-client-common-1.26.7-1.1.aarch64.rpm"
RPM_HASH = "ef052d542389e3b0ed0c3fe63a7e699d9b7711b618c1e37d9aa133af77f76f532f5e3cdd0997931eab65802341add33b0333274e44adc3c712f333f1a7c167d1"

RPROVIDES:${PN} += "kubernetes-client-common \
kubernetes1.26-client-common"

RDEPENDS:${PN} += "/usr/bin/sh \
kubernetes1.26-client"

inherit rpm
