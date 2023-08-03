SUMMARY = "Documentation for texlive-gfsporson"
DESCRIPTION = "This package includes the documentation for texlive-gfsporson"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.01svn18651"

RPM_NAME = "texlive-gfsporson-doc-2023.209.1.01svn18651-53.1.noarch.rpm"
RPM_HASH = "6438a578c42e587f93deeb6bd715f397854b56614b005266e24bcc2d80b74c7385e2576f14889a18c91b31c8f2bc6b1080d1d5bca8d803b8759f3613e491d114"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gfsporson-doc"

RDEPENDS:${PN} += ""

inherit rpm
