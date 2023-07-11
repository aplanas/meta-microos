SUMMARY = "Documentation for texlive-esami"
DESCRIPTION = "This package includes the documentation for texlive-esami"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.7svn61596"

RPM_NAME = "texlive-esami-doc-2023.201.2.7svn61596-53.2.noarch.rpm"
RPM_HASH = "6936079caade7a8b5444c0c20c534a459ff1c3fe8afe212f92cfcf32a161eee39a002916f21a0445c8f5eae9937076cff80a6ccceae5ec707303bfbc7ef8d092"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-esami-doc-en;it \
texlive-esami-doc"

RDEPENDS:${PN} += ""

inherit rpm
