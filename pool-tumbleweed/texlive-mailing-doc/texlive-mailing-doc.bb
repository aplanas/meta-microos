SUMMARY = "Documentation for texlive-mailing"
DESCRIPTION = "This package includes the documentation for texlive-mailing"
LICENSE = "LPPL-1.0"

PV = "2023.208.svn15878"

RPM_NAME = "texlive-mailing-doc-2023.208.svn15878-53.1.noarch.rpm"
RPM_HASH = "ac9c46b518d7de07f0ca3b25e1164cf30f880af362b9e1b3729c1cd8a3f155241f2dbc06f473d88f763b5a946f14ddb985984b487f841d31d46e0ec0d8f5d040"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mailing-doc"

RDEPENDS:${PN} += ""

inherit rpm
