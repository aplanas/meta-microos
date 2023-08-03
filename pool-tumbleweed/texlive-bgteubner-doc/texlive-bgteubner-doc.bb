SUMMARY = "Documentation for texlive-bgteubner"
DESCRIPTION = "This package includes the documentation for texlive-bgteubner"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.11svn54080"

RPM_NAME = "texlive-bgteubner-doc-2023.209.2.11svn54080-54.1.noarch.rpm"
RPM_HASH = "c22f53887d2c60057ace751628c57c09d908378691a2c3d1db2b37f95cdd7281ab21cab62bdc37506713f3f0f17c16ef275335ebb96d045c8fc7aeeb750ba610"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-bgteubner-doc-de \
texlive-bgteubner-doc"

RDEPENDS:${PN} += ""

inherit rpm
