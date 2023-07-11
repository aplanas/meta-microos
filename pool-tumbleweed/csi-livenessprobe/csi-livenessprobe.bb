SUMMARY = "Exposes an HTTP /healthz endpoint to monitor CSI driver"
DESCRIPTION = "The liveness probe is a sidecar container that exposes an HTTP /healthz endpoint, which serves as kubelet's livenessProbe hook to monitor health of a CSI driver."
LICENSE = "Apache-2.0"

PV = "1.1.0"

RPM_NAME = "csi-livenessprobe-1.1.0-1.13.aarch64.rpm"
RPM_HASH = "577d4555822ebec876cb4732b54d8381d4855bdc0dbc2b9f81e36e9aa34f37d944e85907264c9dc782659b9d91a6d176854d6f92c339a51f7b1cdda4949def4e"

RPROVIDES:${PN} += "csi-livenessprobe"

RDEPENDS:${PN} += ""

inherit rpm
