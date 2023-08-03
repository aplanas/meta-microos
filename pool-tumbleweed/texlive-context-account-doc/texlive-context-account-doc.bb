SUMMARY = "Documentation for texlive-context-account"
DESCRIPTION = "This package includes the documentation for texlive-context-account"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn47085"

RPM_NAME = "texlive-context-account-doc-2023.209.svn47085-55.1.noarch.rpm"
RPM_HASH = "386077262abc083545638fba52429e528669d08a6f9090b7f760b6b6f8d94ed4a74ad24afbee7cf548f235e2212bbd4a6dec918f798964115bd672b44e0da553"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-account-doc"

RDEPENDS:${PN} += ""

inherit rpm
