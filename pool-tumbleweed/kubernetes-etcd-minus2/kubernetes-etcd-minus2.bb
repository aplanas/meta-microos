SUMMARY = "Kubernetes etcd daemon for container images"
DESCRIPTION = "This subpackage contains the etcd binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "3.5.6"

RPM_NAME = "kubernetes-etcd-minus2-3.5.6-34.1.aarch64.rpm"
RPM_HASH = "ed60ffc93197307d5e36835315cf56f9c8dee6ceabe659a6f0ef5e0199eee9a1585787b79c49c285afc6c3903ce9a21143cb5acf77187947de4122968d2b1fb6"

RPROVIDES:${PN} += "kubernetes-etcd-minus2"

RDEPENDS:${PN} += "etcd-for-k8s1.25"

inherit rpm
