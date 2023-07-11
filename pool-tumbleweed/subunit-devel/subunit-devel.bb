SUMMARY = "Header files for developing C applications that use subunit"
DESCRIPTION = "Header files and libraries for developing C applications that use subunit."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "subunit-devel-1.4.2-2.4.aarch64.rpm"
RPM_HASH = "0190b33b1f0dc2d54a91dad2a9b29a7ed882821a534da3057b998de5d29b2496761914a7776d691b1516fd409c951b011cec75890cfccadc76d80a8d5573c9bb"

RPROVIDES:${PN} += "pkgconfig-libsubunit \
subunit-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsubunit0 \
subunit"

inherit rpm
