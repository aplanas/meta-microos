SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon"
LICENSE = "Apache-2.0"

PV = "1.27.4"

RPM_NAME = "kubernetes-kubelet-1.27.4-33.1.aarch64.rpm"
RPM_HASH = "080044e46c9f2b3b2c595c2e81310900715d4ea59d3dd77aae0c91bcf19526dc83393955ca2cb77813f3598e3233ed2df411548a4c25f75c81d403c76b832146"

RPROVIDES:${PN} += "kubernetes-kubelet"

RDEPENDS:${PN} += "kubernetes1.27-kubelet"

inherit rpm
