SUMMARY = "Kubernetes etcd daemon for container images"
DESCRIPTION = "This subpackage contains the etcd binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "3.5.7"

RPM_NAME = "kubernetes-etcd-3.5.7-34.1.aarch64.rpm"
RPM_HASH = "dde7c40dae4e7d430df2dd54a9e01f7c96f96e90226a635f47afca8e2ab3795fba5996954ab9db7af1fff38eb3c6398e79639974ce4319c1d57e5759f6a8a568"

RPROVIDES:${PN} += "kubernetes-etcd"

RDEPENDS:${PN} += "etcd-for-k8s1.27"

inherit rpm
