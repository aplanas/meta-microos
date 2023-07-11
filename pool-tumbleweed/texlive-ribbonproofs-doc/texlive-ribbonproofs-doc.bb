SUMMARY = "Documentation for texlive-ribbonproofs"
DESCRIPTION = "This package includes the documentation for texlive-ribbonproofs"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn31137"

RPM_NAME = "texlive-ribbonproofs-doc-2023.201.1.0svn31137-53.2.noarch.rpm"
RPM_HASH = "33d84e8ab758443fe306ce8b21495d0b20fe83ddba717564a21f11e6d2e87cc1a7cbc28c8184d3b4ea513ed89dd88810335fed964494da4de5a1ca80a6a31237"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ribbonproofs-doc"

RDEPENDS:${PN} += ""

inherit rpm
