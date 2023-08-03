SUMMARY = "Documentation for texlive-hideanswer"
DESCRIPTION = "This package includes the documentation for texlive-hideanswer"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn63852"

RPM_NAME = "texlive-hideanswer-doc-2023.209.1.1svn63852-54.1.noarch.rpm"
RPM_HASH = "4fc3827596e886056a3b3e6467416d30610afb40dd0e1cf5d0586da86f5052f457d57628464dc2cba19134394090b8f7e4be0acbc5d9c6ef701e465daa1e7422"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hideanswer-doc"

RDEPENDS:${PN} += ""

inherit rpm
