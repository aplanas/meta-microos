SUMMARY = "Kubernetes client tools common files"
DESCRIPTION = "Kubernetes client tools common files"
LICENSE = "Apache-2.0"

PV = "1.24.15"

RPM_NAME = "kubernetes1.24-client-common-1.24.15-2.1.aarch64.rpm"
RPM_HASH = "02ee82172b90ad7f3f226d45d4212ce28d9691f2e84f90ece002e6d9fe2aec6401f46c8d7859495717517e6851bf95fe846d9eb14046ba70ce2c6a215ee1ec2e"

RPROVIDES:${PN} += "kubernetes-client-common \
kubernetes1.24-client-common"

RDEPENDS:${PN} += "/usr/bin/sh \
kubernetes1.24-client"

inherit rpm
