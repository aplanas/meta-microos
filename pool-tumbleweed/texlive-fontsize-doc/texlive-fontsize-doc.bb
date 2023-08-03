SUMMARY = "Documentation for texlive-fontsize"
DESCRIPTION = "This package includes the documentation for texlive-fontsize"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.8.5svn60161"

RPM_NAME = "texlive-fontsize-doc-2023.209.0.0.8.5svn60161-53.1.noarch.rpm"
RPM_HASH = "ffaba7a62121d4abc160fb4e9f95a1bebd4699089d9c9383e762d371651acabe05a4281c8e4e91fcd20afb67a1b84ee127062afef242131d1381d00e5a0b213d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fontsize-doc"

RDEPENDS:${PN} += ""

inherit rpm
