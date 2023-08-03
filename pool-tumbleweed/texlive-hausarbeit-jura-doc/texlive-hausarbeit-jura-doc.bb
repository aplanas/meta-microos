SUMMARY = "Documentation for texlive-hausarbeit-jura"
DESCRIPTION = "This package includes the documentation for texlive-hausarbeit-jura"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1.0svn56070"

RPM_NAME = "texlive-hausarbeit-jura-doc-2023.209.2.1.0svn56070-54.1.noarch.rpm"
RPM_HASH = "983e64f53ecd121022dc66827571cbf5c4227172859c9d4d789a6677cf238c50472148ec41592fc63e5b5237f57710c4831502e47e43deac3ff450b8df4901d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hausarbeit-jura-doc-de \
texlive-hausarbeit-jura-doc"

RDEPENDS:${PN} += ""

inherit rpm
