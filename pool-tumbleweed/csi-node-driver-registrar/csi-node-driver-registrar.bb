SUMMARY = "Registers the CSI driver with Kubelet"
DESCRIPTION = "Kubernetes node-driver-registrar is a sidecar container that registers the CSI driver with Kubelet using the kubelet plugin registration mechanism."
LICENSE = "Apache-2.0"

PV = "2.0.1"

RPM_NAME = "csi-node-driver-registrar-2.0.1-1.10.aarch64.rpm"
RPM_HASH = "bb205addba8876f514bfc26982e79c7bf75b8726801ecf493bbbefb2d559f04aee20c4402201799552f0e58801e981a1618f76524e6891190fc8ecf15972f62f"

RPROVIDES:${PN} += "csi-node-driver-registrar \
csi-node-driver-registrar(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
