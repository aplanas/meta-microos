SUMMARY = "Documentation for texlive-ycbook"
DESCRIPTION = "This package includes the documentation for texlive-ycbook"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn46201"

RPM_NAME = "texlive-ycbook-doc-2023.209.svn46201-53.1.noarch.rpm"
RPM_HASH = "0026e630204f82769539b93df32fc738e1c5ea2284ef051f6395a57cc3848efb02774685f622b21055d15819dcf04885b02e73a09dea0c8b2d22305f773a444b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ycbook-doc"

RDEPENDS:${PN} += ""

inherit rpm
