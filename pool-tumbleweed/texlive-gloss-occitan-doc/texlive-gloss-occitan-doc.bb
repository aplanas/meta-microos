SUMMARY = "Documentation for texlive-gloss-occitan"
DESCRIPTION = "This package includes the documentation for texlive-gloss-occitan"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn52593"

RPM_NAME = "texlive-gloss-occitan-doc-2023.201.0.0.1svn52593-53.2.noarch.rpm"
RPM_HASH = "32873585b66932aa021dc909570c091bbf7e4437dfba41e854e91c3260305a246f5b1da262f23dd753ef38b29acac4570723f6404dd5c168a50f91ddb49310ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gloss-occitan-doc"

RDEPENDS:${PN} += ""

inherit rpm
