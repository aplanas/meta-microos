SUMMARY = "Documentation for texlive-octavo"
DESCRIPTION = "This package includes the documentation for texlive-octavo"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn15878"

RPM_NAME = "texlive-octavo-doc-2023.209.1.2svn15878-55.1.noarch.rpm"
RPM_HASH = "61ac3cb82f91bc6c8b05b6320235fae918cf85587744707a21168acb5cd004bb4e785852f3d03965cf9ce6464e5add62f52dc82d74d8010228aa354e82273caf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-octavo-doc"

RDEPENDS:${PN} += ""

inherit rpm
