SUMMARY = "Registers the CSI driver with Kubelet"
DESCRIPTION = "Kubernetes node-driver-registrar is a sidecar container that registers the CSI driver with Kubelet using the kubelet plugin registration mechanism."
LICENSE = "Apache-2.0"

PV = "2.0.1"

RPM_NAME = "csi-node-driver-registrar-2.0.1-1.9.aarch64.rpm"
RPM_HASH = "c1aadcb69af93e41125bbd34bf291a73471cac6c3ad3ef073c1660e93190f39cf6fc1e0cc121d154742da33012a46b63c9908e6b340b0698c3e0b47ac896c85d"

RPROVIDES:${PN} += "csi-node-driver-registrar csi-node-driver-registrar(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
