SUMMARY = "Documentation for texlive-moresize"
DESCRIPTION = "This package includes the documentation for texlive-moresize"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.9svn17513"

RPM_NAME = "texlive-moresize-doc-2023.209.1.9svn17513-55.1.noarch.rpm"
RPM_HASH = "57e5aba1adb195b31c0ae3fec155b329d064bb2b526555bfe8d8bccc40fadd1e2f5d691d5311414b72d5bb3278e845617046caf94f54f64dc7de9bd05bf55fda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-moresize-doc"

RDEPENDS:${PN} += ""

inherit rpm
