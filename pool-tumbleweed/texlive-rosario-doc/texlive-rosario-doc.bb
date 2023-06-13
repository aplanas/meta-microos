SUMMARY = "Documentation for texlive-rosario"
DESCRIPTION = "This package includes the documentation for texlive-rosario"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn51688"

RPM_NAME = "texlive-rosario-doc-2023.201.2.1svn51688-53.1.noarch.rpm"
RPM_HASH = "566a0df10c6ffdb09e28393c76b870c7ddd46760c93abe944cb875b132a5c720bb2208a370d23a2918b68c986af9d063d128485fb99fef2f79ccb45968718703"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rosario-doc"

RDEPENDS:${PN} += ""

inherit rpm
