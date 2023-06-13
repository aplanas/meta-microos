SUMMARY = "Rook FlexVolume driver"
DESCRIPTION = "Rook uses FlexVolume to integrate with Kubernetes for performing storage \
operations."
LICENSE = "Apache-2.0"

PV = "1.6.2+git0.ge8fd65f08"

RPM_NAME = "rook-rookflex-1.6.2+git0.ge8fd65f08-2.8.aarch64.rpm"
RPM_HASH = "b3b520c3690d7f8e1f1501c1a38a0e1c330c4aae967ba757e13c193ed6282c7b61ef6152d43c70f8d4b6a25e6243222cbf12f98fdf54da87548978776fe9c181"

RPROVIDES:${PN} += "rook-rookflex \
rook-rookflex(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
