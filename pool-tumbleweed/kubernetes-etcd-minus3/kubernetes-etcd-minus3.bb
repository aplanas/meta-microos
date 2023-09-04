SUMMARY = "Kubernetes etcd daemon for container images"
DESCRIPTION = "This subpackage contains the etcd binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "3.5.6"

RPM_NAME = "kubernetes-etcd-minus3-3.5.6-34.1.aarch64.rpm"
RPM_HASH = "83a58d2a3a52c9ee76814f8237bef9baa1378ab6d87821447938b4bbad26829dd3b03ae8dfee5f901d03c3d6fa8f2e55b42cee9519e4d62c0d9a1f0d5640448e"

RPROVIDES:${PN} += "kubernetes-etcd-minus3"

RDEPENDS:${PN} += "etcd-for-k8s1.24"

inherit rpm
