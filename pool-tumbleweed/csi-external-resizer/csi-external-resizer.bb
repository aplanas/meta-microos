SUMMARY = "Allows volume expansion after creation"
DESCRIPTION = "The CSI external-resizer is a sidecar container that watches the Kubernetes API server for PersistentVolumeClaim updates and triggers ControllerExpandVolume operations against a CSI endpoint if user requested more storage on PersistentVolumeClaim object."
LICENSE = "Apache-2.0"

PV = "1.0.1"

RPM_NAME = "csi-external-resizer-1.0.1-1.11.aarch64.rpm"
RPM_HASH = "7e1ef010addaeb3b75e3715327b2aded79a6173621d2195aea5c5dd5429b4d0514ae75be5374439983d978a1eab0532818740c03271627e48c2ab8166e17824c"

RPROVIDES:${PN} += "csi-external-resizer"

RDEPENDS:${PN} += ""

inherit rpm
