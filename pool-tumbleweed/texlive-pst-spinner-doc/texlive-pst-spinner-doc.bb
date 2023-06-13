SUMMARY = "Documentation for texlive-pst-spinner"
DESCRIPTION = "This package includes the documentation for texlive-pst-spinner"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.02svn66115"

RPM_NAME = "texlive-pst-spinner-doc-2023.201.1.02svn66115-53.1.noarch.rpm"
RPM_HASH = "386877a8f7a26d8f65db9831254c000bf24450c7e302b542ba8ef379ec162fcacb79af50c18f8406bb8a987defce5270757c5b2a9d1e80732fa1c5f5809ba856"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-spinner-doc"

RDEPENDS:${PN} += ""

inherit rpm
