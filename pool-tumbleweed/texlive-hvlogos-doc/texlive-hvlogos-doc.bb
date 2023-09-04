SUMMARY = "Documentation for texlive-hvlogos"
DESCRIPTION = "This package includes the documentation for texlive-hvlogos"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.09svn63261"

RPM_NAME = "texlive-hvlogos-doc-2023.209.0.0.09svn63261-54.1.noarch.rpm"
RPM_HASH = "182a96ac6a669526bfb985afe651724330312fa7d7cbfa1df2be3bd9df69775de77e183a54ccddf9f4ef42dd527b7b120e27365a2547c7025cbb622222bc3c5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hvlogos-doc"

RDEPENDS:${PN} += ""

inherit rpm
