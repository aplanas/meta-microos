SUMMARY = "Documentation for texlive-theoremref"
DESCRIPTION = "This package includes the documentation for texlive-theoremref"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54512"

RPM_NAME = "texlive-theoremref-doc-2023.201.svn54512-54.1.noarch.rpm"
RPM_HASH = "16ac6d5f545543256503d92d880c29fa3229f394099ff86190483b242da5a57273ca98be06b880a5009d71cacb9546cc2a6d6f3a98885acd52f79d0058d25882"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-theoremref-doc"

RDEPENDS:${PN} += ""

inherit rpm
