SUMMARY = "Documentation for texlive-hep-text"
DESCRIPTION = "This package includes the documentation for texlive-hep-text"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn64906"

RPM_NAME = "texlive-hep-text-doc-2023.209.1.1svn64906-54.2.noarch.rpm"
RPM_HASH = "0d76c2024a56b499da1cb60408b0a8093b08c88e414a15ef4683dd90d02c213eb74b291e762f3f8c3cf536a9c2e4bfd3ee939f0dd75f6597b8a290357166120c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-text-doc"

RDEPENDS:${PN} += ""

inherit rpm
