SUMMARY = "Documentation for texlive-circledsteps"
DESCRIPTION = "This package includes the documentation for texlive-circledsteps"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3.1svn63255"

RPM_NAME = "texlive-circledsteps-doc-2023.201.1.3.1svn63255-53.1.noarch.rpm"
RPM_HASH = "4133a0aba272ef0449f853bb08525f49b037796b3d9c7642e14c3294c71291a5d4eb15b55eff52e14e95c84271df001dfc6319b71680a3c5d9bbd46a615237d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-circledsteps-doc"

RDEPENDS:${PN} += ""

inherit rpm
