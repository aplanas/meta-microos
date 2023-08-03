SUMMARY = "Documentation for texlive-frpseudocode"
DESCRIPTION = "This package includes the documentation for texlive-frpseudocode"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3.0svn56088"

RPM_NAME = "texlive-frpseudocode-doc-2023.209.0.0.3.0svn56088-53.1.noarch.rpm"
RPM_HASH = "236bad8b332546757c0f394c5b945efaa12baca6d4c1e8f9af1fb28347307d08223b57aaa02796d883127d9aebfecec6d8dab8e1bdc0b9e9e9dc4f2b1f16dc87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-frpseudocode-doc"

RDEPENDS:${PN} += ""

inherit rpm
