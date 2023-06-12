SUMMARY = "Documentation for texlive-datetime2-english"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-english"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.05svn52479"

RPM_NAME = "texlive-datetime2-english-doc-2023.201.1.05svn52479-52.1.noarch.rpm"
RPM_HASH = "730ccd96de7b5d2f79816497c3349d6b28c18a9507b02cf5059df7b129a74bea09ab5b7727cb3fbc9deb3f7ed336c0c59d4924a1b219877fb2ee18317b37c815"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-english-doc"
RDEPENDS:${PN} += ""

inherit rpm
