SUMMARY = "Triggers CreateSnapshot/DeleteSnapshot against a CSI endpoint"
DESCRIPTION = "Kubernetes CSI external-snapshotter sidecar watches Kubernetes VolumeSnapshotContent CRD objects and triggers CreateSnapshot/DeleteSnapshot against a CSI endpoint."
LICENSE = "Apache-2.0"

PV = "4.0.0"

RPM_NAME = "csi-external-snapshotter-4.0.0-1.9.aarch64.rpm"
RPM_HASH = "d79622d7b215b6104e92bd6a025c2381169e5fd5d13a957b24c48346eb92c83e26477130a66da1eed11689a47bd307f50cadfd8e6f11335c692fc613982c6d19"

RPROVIDES:${PN} += "csi-external-snapshotter"

RDEPENDS:${PN} += ""

inherit rpm
