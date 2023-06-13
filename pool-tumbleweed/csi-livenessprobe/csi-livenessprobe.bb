SUMMARY = "Exposes an HTTP /healthz endpoint to monitor CSI driver"
DESCRIPTION = "The liveness probe is a sidecar container that exposes an HTTP /healthz endpoint, which serves as kubelet's livenessProbe hook to monitor health of a CSI driver."
LICENSE = "Apache-2.0"

PV = "1.1.0"

RPM_NAME = "csi-livenessprobe-1.1.0-1.12.aarch64.rpm"
RPM_HASH = "9b077b41a47859fdd3fe97f162a0b541825b8fa58013abd6d780c03f8ccb82154e20b566fbf08da0656aaddc76659a89ca4fb97325bdcd5aa974475a1f030f45"

RPROVIDES:${PN} += "csi-livenessprobe \
csi-livenessprobe(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
