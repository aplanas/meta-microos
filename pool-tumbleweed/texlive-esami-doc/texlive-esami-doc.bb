SUMMARY = "Documentation for texlive-esami"
DESCRIPTION = "This package includes the documentation for texlive-esami"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.7svn61596"

RPM_NAME = "texlive-esami-doc-2023.201.2.7svn61596-53.1.noarch.rpm"
RPM_HASH = "5ceb074b534c67cecfe747dceace7c537b7e8b685d9f9dc2f1152beffbac689ab83e9c97b92e510ed6f7dc30d0831a86d17cea00227f3504ad563c28c8993525"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-esami-doc:en;it) \
texlive-esami-doc"
RDEPENDS:${PN} += ""

inherit rpm
