SUMMARY = "Documentation for texlive-numname"
DESCRIPTION = "This package includes the documentation for texlive-numname"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn18130"

RPM_NAME = "texlive-numname-doc-2023.201.svn18130-54.1.noarch.rpm"
RPM_HASH = "e5b0502a87dd0023c034e850a5684933fd9012dec70393962d91e51e001aeca6dce1e65ad279bfff89a42b1071e0bfdfcce1b6cc181a2eb4013292a3f71658e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-numname-doc"

RDEPENDS:${PN} += ""

inherit rpm
