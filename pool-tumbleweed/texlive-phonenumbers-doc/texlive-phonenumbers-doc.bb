SUMMARY = "Documentation for texlive-phonenumbers"
DESCRIPTION = "This package includes the documentation for texlive-phonenumbers"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.5svn63774"

RPM_NAME = "texlive-phonenumbers-doc-2023.209.2.5svn63774-52.1.noarch.rpm"
RPM_HASH = "e8fb16555b62d03186e11a7ced4be0836fb12eb8a2d10e1c7dabf6fa4320aafe1f7fc1ada29946f7d8fa9ddcba74181c8f1e8027d42c93d500d65570dfc3f256"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-phonenumbers-doc-de \
texlive-phonenumbers-doc"

RDEPENDS:${PN} += ""

inherit rpm
