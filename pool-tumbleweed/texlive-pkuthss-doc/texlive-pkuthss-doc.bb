SUMMARY = "Documentation for texlive-pkuthss"
DESCRIPTION = "This package includes the documentation for texlive-pkuthss"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.9.3svn64869"

RPM_NAME = "texlive-pkuthss-doc-2023.209.1.9.3svn64869-52.1.noarch.rpm"
RPM_HASH = "f42f0087660b83af350dc97d740681e7236e83e1bedee0a2c376f7ae78ec4f890df967c9d4055d47ee9f0196e916b7f7f78be3374e2452b0aeab776a5eb084fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pkuthss-doc-zh \
texlive-pkuthss-doc"

RDEPENDS:${PN} += ""

inherit rpm
