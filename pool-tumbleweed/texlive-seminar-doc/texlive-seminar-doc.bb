SUMMARY = "Documentation for texlive-seminar"
DESCRIPTION = "This package includes the documentation for texlive-seminar"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.63asvn59801"

RPM_NAME = "texlive-seminar-doc-2023.209.1.63asvn59801-54.1.noarch.rpm"
RPM_HASH = "f974d9ea0e7d8bd96b9dc084103a3afdf6d34959052e2920a408622f9976f5c87a6ac5af201aae237784d8dbb3867574d896ada3c8cb6fae15b5bd0a6d585e95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-seminar-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
