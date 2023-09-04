SUMMARY = "Kubernetes client tools common files"
DESCRIPTION = "Kubernetes client tools common files"
LICENSE = "Apache-2.0"

PV = "1.26.7"

RPM_NAME = "kubernetes1.26-client-common-1.26.7-2.1.aarch64.rpm"
RPM_HASH = "ff456228b0ceaf4e9265b37e415f53024635c2d4fd47a0951674e75663915da94529951f59025b20ecea95b576daaed71e4709d6ab29fa441e13c5e147dc989f"

RPROVIDES:${PN} += "kubernetes-client-common \
kubernetes1.26-client-common"

RDEPENDS:${PN} += "/usr/bin/sh \
kubernetes1.26-client"

inherit rpm
