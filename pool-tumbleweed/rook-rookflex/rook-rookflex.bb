SUMMARY = "Rook FlexVolume driver"
DESCRIPTION = "Rook uses FlexVolume to integrate with Kubernetes for performing storage \
operations."
LICENSE = "Apache-2.0"

PV = "1.6.2+git0.ge8fd65f08"

RPM_NAME = "rook-rookflex-1.6.2+git0.ge8fd65f08-2.9.aarch64.rpm"
RPM_HASH = "78201e91174b4500acaa6302a7375bc0dab9a634b1457dd7a70f2eb656033737bc7c51b3a0e122f08b7a7bb12f03a583f67f8da21939b96d2269bead309c4702"

RPROVIDES:${PN} += "rook-rookflex"

RDEPENDS:${PN} += ""

inherit rpm
