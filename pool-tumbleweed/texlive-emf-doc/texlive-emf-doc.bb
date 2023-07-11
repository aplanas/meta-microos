SUMMARY = "Documentation for texlive-emf"
DESCRIPTION = "This package includes the documentation for texlive-emf"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1svn42023"

RPM_NAME = "texlive-emf-doc-2023.201.1svn42023-53.2.noarch.rpm"
RPM_HASH = "6c5388d7c27bc423fb3e5f43319c6287959f58d21dde365f59310e7dd9cd05312bb804d4e667af67dc545729572399840d4c9c7f6a1df2e9021843b94c5d431b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-emf-doc"

RDEPENDS:${PN} += ""

inherit rpm
