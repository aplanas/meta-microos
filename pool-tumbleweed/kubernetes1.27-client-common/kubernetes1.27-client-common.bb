SUMMARY = "Kubernetes client tools common files"
DESCRIPTION = "Kubernetes client tools common files"
LICENSE = "Apache-2.0"

PV = "1.27.4"

RPM_NAME = "kubernetes1.27-client-common-1.27.4-2.1.aarch64.rpm"
RPM_HASH = "8b14550fb63793e380f00a6f7655f1464b937121bb82de2c93b99a558b1c78b798334807e7ad1e3ec87033c8d47f725ac23349625942b0d1c27b625b4df07c1c"

RPROVIDES:${PN} += "kubernetes-client-common \
kubernetes1.27-client-common"

RDEPENDS:${PN} += "/usr/bin/sh \
kubernetes1.27-client"

inherit rpm
