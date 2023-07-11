SUMMARY = "Documentation for texlive-ec"
DESCRIPTION = "This package includes the documentation for texlive-ec"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn25033"

RPM_NAME = "texlive-ec-doc-2023.201.1.0svn25033-53.2.noarch.rpm"
RPM_HASH = "c9b36bdd4dfc95d645a6a85944271fcfbc1f7389b474be554a88679fa552c8a67d7803c57278128d4a8965b1b803edcf47aaaab344ca25cfe0c984c2943c862a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ec-doc"

RDEPENDS:${PN} += ""

inherit rpm
