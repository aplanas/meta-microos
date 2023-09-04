SUMMARY = "Documentation for texlive-pstricks"
DESCRIPTION = "This package includes the documentation for texlive-pstricks"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.18svn65346"

RPM_NAME = "texlive-pstricks-doc-2023.209.3.18svn65346-54.2.noarch.rpm"
RPM_HASH = "3e2b88630f54f9b50ef41940bf3117e63dc098e664665d38b96178c8b766c0796ab9a63a09955b6df8d4eda2a3a5eb7d1f97717b8f7ceca753ef5e3df91117bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pstricks-doc"

RDEPENDS:${PN} += ""

inherit rpm
