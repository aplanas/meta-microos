SUMMARY = "Triggers CreateSnapshot/DeleteSnapshot against a CSI endpoint"
DESCRIPTION = "Kubernetes CSI external-snapshotter sidecar watches Kubernetes VolumeSnapshotContent CRD objects and triggers CreateSnapshot/DeleteSnapshot against a CSI endpoint."
LICENSE = "Apache-2.0"

PV = "4.0.0"

RPM_NAME = "csi-external-snapshotter-4.0.0-1.8.aarch64.rpm"
RPM_HASH = "c10586eed3813351630d104af7748f87f63085d73fcdd3e38b666904062fe9ac8a81f479b579378c0c31fca01d720ef6ac6847d9e400fba89d64e3b9d034f22a"

RPROVIDES:${PN} += "csi-external-snapshotter csi-external-snapshotter(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
