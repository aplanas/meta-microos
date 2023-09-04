SUMMARY = "Documentation for texlive-inversepath"
DESCRIPTION = "This package includes the documentation for texlive-inversepath"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn15878"

RPM_NAME = "texlive-inversepath-doc-2023.209.0.0.2svn15878-54.1.noarch.rpm"
RPM_HASH = "494ea98684273ffcfcb351e750ca4efb0aea46ac1a3bb9ae00464f0e5a628a52d7ed2fe87200783f762a75fdac7382d07649f72aea391641ac9c208003196365"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-inversepath-doc"

RDEPENDS:${PN} += ""

inherit rpm
