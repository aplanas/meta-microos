SUMMARY = "Documentation for texlive-thucoursework"
DESCRIPTION = "This package includes the documentation for texlive-thucoursework"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.6svn56435"

RPM_NAME = "texlive-thucoursework-doc-2023.201.2.6svn56435-54.1.noarch.rpm"
RPM_HASH = "404d821ca9bfdc5fa8937bba138da8642168b376261a99b57ab760fe66f62eb72fa3b22f32b037a85c967a5d13c105419c3c360da973e5eb1632ae08bdd1bdad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-thucoursework-doc:zh) \
texlive-thucoursework-doc"

RDEPENDS:${PN} += ""

inherit rpm
