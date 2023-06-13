SUMMARY = "Documentation for texlive-l3backend"
DESCRIPTION = "This package includes the documentation for texlive-l3backend"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65573"

RPM_NAME = "texlive-l3backend-doc-2023.201.svn65573-55.1.noarch.rpm"
RPM_HASH = "6588df7046db67bb0c401426417c3c3465f180aff30dfdb298104e6f7a0d717017cf5017286fb294ac5784b3eec1e506969f8142c032ca2719c7e6cf793263bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-l3backend-doc"

RDEPENDS:${PN} += ""

inherit rpm
