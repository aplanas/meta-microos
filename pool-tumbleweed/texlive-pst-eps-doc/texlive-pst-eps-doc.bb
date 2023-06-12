SUMMARY = "Documentation for texlive-pst-eps"
DESCRIPTION = "This package includes the documentation for texlive-pst-eps"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-pst-eps-doc-2023.201.1.0svn15878-52.1.noarch.rpm"
RPM_HASH = "ff6a305ccd490afbf80a6457826a188fbc9353c435783f79c3a1bb0e995a8208b08729c6b50a145267fbc98638615292a709f5bb5300ed8fb500593da5d4de71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-eps-doc"
RDEPENDS:${PN} += ""

inherit rpm
