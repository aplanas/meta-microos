SUMMARY = "Registers the CSI driver with Kubelet"
DESCRIPTION = "Kubernetes node-driver-registrar is a sidecar container that registers the CSI driver with Kubelet using the kubelet plugin registration mechanism."
LICENSE = "Apache-2.0"

PV = "2.0.1"

RPM_NAME = "csi-node-driver-registrar-2.0.1-1.11.aarch64.rpm"
RPM_HASH = "ea26b380f2977793cccb2615f810904a26b51083921453fd1fc4a6a6d99a89411072ae5bb8317797aed6493f40f2ac528209b45b5a00565531a81b44abd00f09"

RPROVIDES:${PN} += "csi-node-driver-registrar"

RDEPENDS:${PN} += ""

inherit rpm
