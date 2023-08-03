SUMMARY = "Kubernetes apiserver for container image"
DESCRIPTION = "This subpackage contains the kube-apiserver binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.26.7"

RPM_NAME = "kubernetes-apiserver-minus1-1.26.7-33.1.aarch64.rpm"
RPM_HASH = "964faeb5757cdcdb3380d3271662b2c4623cd025382867e4e4a7d5257e6da0106bd39b274ccfcec1772839b1ee716b63829ab23e169f875b79581fa8c858bfab"

RPROVIDES:${PN} += "kubernetes-apiserver-minus1"

RDEPENDS:${PN} += "kubernetes1.26-apiserver"

inherit rpm
