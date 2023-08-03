SUMMARY = "Kubernetes apiserver for container image"
DESCRIPTION = "This subpackage contains the kube-apiserver binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.25.12"

RPM_NAME = "kubernetes1.25-apiserver-1.25.12-1.1.aarch64.rpm"
RPM_HASH = "b3700cde56ec77444bafc03682c40e3ca47625433490e878a7a682f0d93613b75643197e7fceaf6d0a3413b729b2ef5489497fe15237ff91fbda9c471b3fd91f"

RPROVIDES:${PN} += "kubernetes-apiserver-provider \
kubernetes1.25-apiserver"

RDEPENDS:${PN} += ""

inherit rpm
