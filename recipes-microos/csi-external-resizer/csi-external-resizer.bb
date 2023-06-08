SUMMARY = "Allows volume expansion after creation"
DESCRIPTION = "The CSI external-resizer is a sidecar container that watches the Kubernetes API server for PersistentVolumeClaim updates and triggers ControllerExpandVolume operations against a CSI endpoint if user requested more storage on PersistentVolumeClaim object."
LICENSE = "Apache-2.0"

PV = "1.0.1"

RPM_NAME = "csi-external-resizer-1.0.1-1.9.aarch64.rpm"
RPM_HASH = "b0dfcf599337a60982de0486672cbaa8b2130c3bea4998ca666b82f4bd60987b01ba9a3439a1d5ad7866187d3d4a495f9e322ac29e8d5e6faca7d8c733fab18e"

RPROVIDES:${PN} += "csi-external-resizer csi-external-resizer(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
