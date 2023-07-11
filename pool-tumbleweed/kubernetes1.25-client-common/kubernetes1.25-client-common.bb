SUMMARY = "Kubernetes client tools common files"
DESCRIPTION = "Kubernetes client tools common files"
LICENSE = "Apache-2.0"

PV = "1.25.11"

RPM_NAME = "kubernetes1.25-client-common-1.25.11-1.1.aarch64.rpm"
RPM_HASH = "d807ba1f3c38a65523c17cdf8ae3d659e22f6114b838936121cb36c2d4a22a51b7d27cf3549362feb401bffe9da4b5bdc2fedcd3a3878429a80f510ba2415ca0"

RPROVIDES:${PN} += "kubernetes-client-common \
kubernetes1.25-client-common"

RDEPENDS:${PN} += "/usr/bin/sh \
kubernetes1.25-client"

inherit rpm
