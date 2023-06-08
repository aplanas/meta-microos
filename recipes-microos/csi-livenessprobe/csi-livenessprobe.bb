SUMMARY = "Exposes an HTTP /healthz endpoint to monitor CSI driver"
DESCRIPTION = "The liveness probe is a sidecar container that exposes an HTTP /healthz endpoint, which serves as kubelet's livenessProbe hook to monitor health of a CSI driver."
LICENSE = "Apache-2.0"

PV = "1.1.0"

RPM_NAME = "csi-livenessprobe-1.1.0-1.11.aarch64.rpm"
RPM_HASH = "ff3627f48ce6102f5226dad8c983ac2ee34d32f42535d4e6e0fb24943da96fc6908d4a25f9dcb27a4f81d29d95ee0725e67351445a928a1132b1bc47aa193008"

RPROVIDES:${PN} += "csi-livenessprobe csi-livenessprobe(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
