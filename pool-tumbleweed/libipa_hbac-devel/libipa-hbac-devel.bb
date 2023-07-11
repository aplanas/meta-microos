SUMMARY = "Development files for the FreeIPA HBAC Evaluator library"
DESCRIPTION = "Utility library to validate FreeIPA HBAC rules for authorization \
requests."
LICENSE = "LGPL-3.0-or-later"

PV = "2.9.1"

RPM_NAME = "libipa_hbac-devel-2.9.1-1.1.aarch64.rpm"
RPM_HASH = "78527b222c51ca1ed183ca0495470c29bead70beee3567341751830c3da3bdc5bd1a1cfa28093f4809c5809f9a26ccd406de55d51aa6e62bda9a33e6141b8923"

RPROVIDES:${PN} += "libipa-hbac-devel \
pkgconfig-ipa-hbac"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libipa-hbac0"

inherit rpm
