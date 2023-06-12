SUMMARY = "Allows volume expansion after creation"
DESCRIPTION = "The CSI external-resizer is a sidecar container that watches the Kubernetes API server for PersistentVolumeClaim updates and triggers ControllerExpandVolume operations against a CSI endpoint if user requested more storage on PersistentVolumeClaim object."
LICENSE = "Apache-2.0"

PV = "1.0.1"

RPM_NAME = "csi-external-resizer-1.0.1-1.10.aarch64.rpm"
RPM_HASH = "6e483e73419bbae864af719e429b407218fdb95ec0c110a27eeefe9c124806656fabe2a6b93810417b0a1fd4e871f00c00de8f0590b8b46ec99c2ac6ed764623"

RPROVIDES:${PN} += "csi-external-resizer \
csi-external-resizer(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
