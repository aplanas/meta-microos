SUMMARY = "Kubernetes etcd daemon for container images"
DESCRIPTION = "This subpackage contains the etcd binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "3.5.7"

RPM_NAME = "kubernetes-etcd-3.5.7-33.1.aarch64.rpm"
RPM_HASH = "77772c21fbd044505bc26615db71b0781f46d9670b6a67552452e5968eb5d8e79af2d87cf76e9babc4aa76dc2e34b08506044edb500d919aa3d4f6b20adb1b48"

RPROVIDES:${PN} += "kubernetes-etcd"

RDEPENDS:${PN} += "etcd-for-k8s1.27"

inherit rpm
