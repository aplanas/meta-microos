SUMMARY = "Documentation for texlive-pst-rubans"
DESCRIPTION = "This package includes the documentation for texlive-pst-rubans"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn23464"

RPM_NAME = "texlive-pst-rubans-doc-2023.201.1.2svn23464-53.2.noarch.rpm"
RPM_HASH = "c01c760f35890c8ad509e02b34209377f007c6abede944f331575b14b1933a6038c59fcfa00a7fb1bc985e1ac83640cce17e4dbcd81a292f3227fbe053131c94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-rubans-doc"

RDEPENDS:${PN} += ""

inherit rpm
