SUMMARY = "Attaches/detaches volumes to/from nodes"
DESCRIPTION = "Kubernetes external-attacher is an external controller that monitors VolumeAttachment objects created by controller-manager and attaches/detaches volumes to/from nodes (i.e. calls ControllerPublish/ControllerUnpublish."
LICENSE = "Apache-2.0"

PV = "3.0.2"

RPM_NAME = "csi-external-attacher-3.0.2-1.9.aarch64.rpm"
RPM_HASH = "35b6d181442ac33d39027e7d3ab114b0274d433baf27ed9508f3430808080a034d4718fdce4564036fb3b5f04e0324ec3059416768bd913c5decd6b6d7eab41b"

RPROVIDES:${PN} += "csi-external-attacher csi-external-attacher(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
