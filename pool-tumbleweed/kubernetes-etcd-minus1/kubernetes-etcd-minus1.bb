SUMMARY = "Kubernetes etcd daemon for container images"
DESCRIPTION = "This subpackage contains the etcd binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "3.5.6"

RPM_NAME = "kubernetes-etcd-minus1-3.5.6-33.1.aarch64.rpm"
RPM_HASH = "11071007535c96ca985f2a4b5c1f7b4b6629f6e6fa312136e5140824b63b854dc67cf6af86b17d8e73d727e1ce17c71a9f23d7f93503451529867c711008ae22"

RPROVIDES:${PN} += "kubernetes-etcd-minus1"

RDEPENDS:${PN} += "etcd-for-k8s1.26"

inherit rpm
