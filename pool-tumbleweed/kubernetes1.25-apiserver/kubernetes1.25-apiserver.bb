SUMMARY = "Kubernetes apiserver for container image"
DESCRIPTION = "This subpackage contains the kube-apiserver binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.25.11"

RPM_NAME = "kubernetes1.25-apiserver-1.25.11-1.1.aarch64.rpm"
RPM_HASH = "40ea99bb364b8ad078a8cf1a458d0522c53308d32aa4ff4253d1a4ad51e4f44ab9cfb436ad44575c1c0b9592131746f40521a440e2ecf1dfe6ba860689be01e9"

RPROVIDES:${PN} += "kubernetes-apiserver-provider \
kubernetes1.25-apiserver"

RDEPENDS:${PN} += ""

inherit rpm
