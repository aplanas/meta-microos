SUMMARY = "Kubernetes etcd daemon for container images"
DESCRIPTION = "This subpackage contains the etcd binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "3.5.7"

RPM_NAME = "kubernetes-etcd-3.5.7-30.1.aarch64.rpm"
RPM_HASH = "b2571efc6bb935e053595353d27bd676e63c1ac8c21dac9aacad85d769f43298df292dfbf458dfc833961f2c6088362786decb5005fb58f64ecc97af66c4fd32"

RPROVIDES:${PN} += "kubernetes-etcd \
kubernetes-etcd(aarch-64)"

RDEPENDS:${PN} += "etcd-for-k8s1.27"

inherit rpm
