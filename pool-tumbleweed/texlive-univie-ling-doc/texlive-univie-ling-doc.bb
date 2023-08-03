SUMMARY = "Documentation for texlive-univie-ling"
DESCRIPTION = "This package includes the documentation for texlive-univie-ling"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3svn65651"

RPM_NAME = "texlive-univie-ling-doc-2023.209.2.3svn65651-54.1.noarch.rpm"
RPM_HASH = "57f5c437111d0c4c88d84343335a047468e1b65cbead8462ecfc02738ea297c63eb834f0e0b223c65afd553c1c4bae17901ce4b1d511e2bd1a6d1d83793cde72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-univie-ling-doc"

RDEPENDS:${PN} += ""

inherit rpm
