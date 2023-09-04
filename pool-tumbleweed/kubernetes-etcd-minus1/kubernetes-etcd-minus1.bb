SUMMARY = "Kubernetes etcd daemon for container images"
DESCRIPTION = "This subpackage contains the etcd binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "3.5.6"

RPM_NAME = "kubernetes-etcd-minus1-3.5.6-34.1.aarch64.rpm"
RPM_HASH = "19ac8a7e3552705ffba34f912fbc3f8ed2afae081b50888ab1bb9ff69ebdb4bb139555b49bdee9dfcce2f94d4af812bb0583dd2f0d7c2489da600931edbff764"

RPROVIDES:${PN} += "kubernetes-etcd-minus1"

RDEPENDS:${PN} += "etcd-for-k8s1.26"

inherit rpm
