SUMMARY = "Documentation for texlive-epigrafica"
DESCRIPTION = "This package includes the documentation for texlive-epigrafica"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.01svn17210"

RPM_NAME = "texlive-epigrafica-doc-2023.201.1.01svn17210-53.1.noarch.rpm"
RPM_HASH = "2a7ec58fbbb7eb3805f2efa165906ee5d68649db049e0bed67d3f71ae27a4d5f363ae93a628d09b4ddbffb0b5a753f8b23396d6c6d43dbaf3fbec96c110c8d8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epigrafica-doc"
RDEPENDS:${PN} += ""

inherit rpm
