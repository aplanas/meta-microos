SUMMARY = "Documentation for texlive-tiscreen"
DESCRIPTION = "This package includes the documentation for texlive-tiscreen"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn62602"

RPM_NAME = "texlive-tiscreen-doc-2023.209.svn62602-53.1.noarch.rpm"
RPM_HASH = "3fe52258e5adede5c288bdc71a04f7d2287f19fc27d3c3b893e5250dbabc72c0a3139519ffb6c126c71fa8e4b6c4e657dd71cebd6fe873ee8e0991d713e12d76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tiscreen-doc"

RDEPENDS:${PN} += ""

inherit rpm
