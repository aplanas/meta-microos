SUMMARY = "Documentation for texlive-jsclasses"
DESCRIPTION = "This package includes the documentation for texlive-jsclasses"
LICENSE = "BSD-3-Clause"

PV = "2023.209.svn66093"

RPM_NAME = "texlive-jsclasses-doc-2023.209.svn66093-56.1.noarch.rpm"
RPM_HASH = "974a1352f0dabd2dd0a98da822331f390f3cfa0341b8c07416a4f9ca741cdc4feed1161fe1256c791108ecc1883ec97a1c7d6f1ac7e106628b9db6d8f9095ed5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-jsclasses-doc-ja \
texlive-jsclasses-doc"

RDEPENDS:${PN} += ""

inherit rpm
