SUMMARY = "Documentation for texlive-lettre"
DESCRIPTION = "This package includes the documentation for texlive-lettre"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.002svn54722"

RPM_NAME = "texlive-lettre-doc-2023.209.3.002svn54722-55.1.noarch.rpm"
RPM_HASH = "2cdfa47b398df4515e617c62c5ecd5bd4d5669d46489638df4bc7219e6d7c177bb81137b6d9e3b75253b1dd453e9cd9f4d8f2749c124568cfcf723dedf7f9ff5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-lettre-doc-fr \
texlive-lettre-doc"

RDEPENDS:${PN} += ""

inherit rpm
