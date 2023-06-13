SUMMARY = "Translations for Psi+"
DESCRIPTION = "Various translations for Psi+."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.1606.2+0"

RPM_NAME = "psi+-lang-1.5.1606.2+0-3.1.noarch.rpm"
RPM_HASH = "2c5cdf1383c2140d6f7d0bc3191f115faf1162209f9fd82a41cf3190b6e99e4d8a38f7244726aa67a225aea4cd6287add9ca627296a05e9e9b907e8782d6f388"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "psi+-lang"

RDEPENDS:${PN} += "psi+"

inherit rpm
