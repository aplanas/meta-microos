SUMMARY = "Documentation for texlive-prooftrees"
DESCRIPTION = "This package includes the documentation for texlive-prooftrees"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7_svn_8641svn52221"

RPM_NAME = "texlive-prooftrees-doc-2023.209.0.0.7_svn_8641svn52221-53.1.noarch.rpm"
RPM_HASH = "d50048dc071b8f826b081f205ef1752a2950cd377ed66c4fca2cc3a3dbec6b73d371e2217e29a70e47de5fd313b883039f6a57ce0545f3b5fb5e3ca0d5745abc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-prooftrees-doc"

RDEPENDS:${PN} += ""

inherit rpm
