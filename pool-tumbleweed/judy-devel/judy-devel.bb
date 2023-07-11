SUMMARY = "Development files for Judy"
DESCRIPTION = "This package holds the development files for Judy."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.5"

RPM_NAME = "judy-devel-1.0.5-10.13.aarch64.rpm"
RPM_HASH = "c1612e2508e2076598db6c6dedc4060e96bf37da947e8b352add6a45da0a07e652bd6f141dfba05299e9c7628dee9cd628a523162caf726d2dae24c4c8ec7328"

RPROVIDES:${PN} += "judy-devel"

RDEPENDS:${PN} += "libJudy1"

inherit rpm
