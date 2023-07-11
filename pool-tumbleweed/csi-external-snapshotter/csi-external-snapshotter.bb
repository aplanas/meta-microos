SUMMARY = "Triggers CreateSnapshot/DeleteSnapshot against a CSI endpoint"
DESCRIPTION = "Kubernetes CSI external-snapshotter sidecar watches Kubernetes VolumeSnapshotContent CRD objects and triggers CreateSnapshot/DeleteSnapshot against a CSI endpoint."
LICENSE = "Apache-2.0"

PV = "4.0.0"

RPM_NAME = "csi-external-snapshotter-4.0.0-1.10.aarch64.rpm"
RPM_HASH = "4710d757d367140ab855f1db34a6f20e8ac7a9247b02171fbd15c4e47993fd52a405d5ad3c7c5d25db93f61b38de1a8d06df3a08179c2aa03820794341228d0b"

RPROVIDES:${PN} += "csi-external-snapshotter"

RDEPENDS:${PN} += ""

inherit rpm
