SUMMARY = "Attaches/detaches volumes to/from nodes"
DESCRIPTION = "Kubernetes external-attacher is an external controller that monitors VolumeAttachment objects created by controller-manager and attaches/detaches volumes to/from nodes (i.e. calls ControllerPublish/ControllerUnpublish."
LICENSE = "Apache-2.0"

PV = "3.0.2"

RPM_NAME = "csi-external-attacher-3.0.2-1.10.aarch64.rpm"
RPM_HASH = "e00c3e8ae01556038af195e71536559ba02ad70e3c2a92bdb34b933ae95033a74f1f794ea84bcd67b756155a99e0edceb5d7de6bde67d260283990a8ac2e6988"

RPROVIDES:${PN} += "csi-external-attacher"

RDEPENDS:${PN} += ""

inherit rpm
