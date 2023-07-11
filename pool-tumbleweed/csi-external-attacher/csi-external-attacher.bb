SUMMARY = "Attaches/detaches volumes to/from nodes"
DESCRIPTION = "Kubernetes external-attacher is an external controller that monitors VolumeAttachment objects created by controller-manager and attaches/detaches volumes to/from nodes (i.e. calls ControllerPublish/ControllerUnpublish."
LICENSE = "Apache-2.0"

PV = "3.0.2"

RPM_NAME = "csi-external-attacher-3.0.2-1.11.aarch64.rpm"
RPM_HASH = "ae66a5c575f672cd52cb077830a8c9e908b82fec47d9a1c7e8372d69427bb99b4036188a3789f2eb6213d32479fc54997136e6158f508240d237dbea5575cb15"

RPROVIDES:${PN} += "csi-external-attacher"

RDEPENDS:${PN} += ""

inherit rpm
