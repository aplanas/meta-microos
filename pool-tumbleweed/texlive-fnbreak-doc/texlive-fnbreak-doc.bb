SUMMARY = "Documentation for texlive-fnbreak"
DESCRIPTION = "This package includes the documentation for texlive-fnbreak"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.30svn25003"

RPM_NAME = "texlive-fnbreak-doc-2023.201.1.30svn25003-52.1.noarch.rpm"
RPM_HASH = "b1049a77516a0ed63455a3886751e02b5ded38a5d0173dd29c8d7e8c66eee9e3ea9314dab44251c01d48c93e00b0f9dba668bbf98e8239266079293dd7b9447e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fnbreak-doc"
RDEPENDS:${PN} += ""

inherit rpm
