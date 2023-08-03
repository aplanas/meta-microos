SUMMARY = "Documentation for texlive-anonchap"
DESCRIPTION = "This package includes the documentation for texlive-anonchap"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1asvn17049"

RPM_NAME = "texlive-anonchap-doc-2023.209.1.1asvn17049-55.1.noarch.rpm"
RPM_HASH = "ccf7108b1b79e7bc55c6b57703400c9b7b9dcde41c43baa0e2fa00fd2455193912f09e8a46c6659a23687ce281a56e8e9af0ea2894f2ce7519af7ede505cea7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-anonchap-doc"

RDEPENDS:${PN} += ""

inherit rpm
