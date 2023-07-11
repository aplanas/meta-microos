SUMMARY = "Kubernetes etcd daemon for container images"
DESCRIPTION = "This subpackage contains the etcd binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "3.5.6"

RPM_NAME = "kubernetes-etcd-minus1-3.5.6-32.1.aarch64.rpm"
RPM_HASH = "18945cae13c103972ae76bce97750e1d0573b9071bce566adfec20f3e4fd73cd8fb9d2c741ed904b117b90e803c062ddb5b9edb854bc269205e1dfc14581714c"

RPROVIDES:${PN} += "kubernetes-etcd-minus1"

RDEPENDS:${PN} += "etcd-for-k8s1.26"

inherit rpm
