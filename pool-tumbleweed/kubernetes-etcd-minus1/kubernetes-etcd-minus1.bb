SUMMARY = "Kubernetes etcd daemon for container images"
DESCRIPTION = "This subpackage contains the etcd binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "3.5.6"

RPM_NAME = "kubernetes-etcd-minus1-3.5.6-30.1.aarch64.rpm"
RPM_HASH = "dd024602a3a7215d91b1ade5d72ad3dc91a85869530f7f405ac005f014c0e24f4358c3866254228d7d76051c6a23b43f439d2f2aae3d6d0d5da250e8e612c890"

RPROVIDES:${PN} += "kubernetes-etcd-minus1"

RDEPENDS:${PN} += "etcd-for-k8s1.26"

inherit rpm
