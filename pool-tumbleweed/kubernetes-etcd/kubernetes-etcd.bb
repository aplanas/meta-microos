SUMMARY = "Kubernetes etcd daemon for container images"
DESCRIPTION = "This subpackage contains the etcd binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "3.5.7"

RPM_NAME = "kubernetes-etcd-3.5.7-32.1.aarch64.rpm"
RPM_HASH = "86a2d9258fffec0bdf4cb68cf689eebfbe72b7fef939ced2c287a3a3fbaac8a65a72d6d838d96119bce1e3be545e527a89c33f85a1139bacf084845d49645c27"

RPROVIDES:${PN} += "kubernetes-etcd"

RDEPENDS:${PN} += "etcd-for-k8s1.27"

inherit rpm
