SUMMARY = "Documentation for texlive-cclicenses"
DESCRIPTION = "This package includes the documentation for texlive-cclicenses"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-cclicenses-doc-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "e8195cdbf33345b2a297c6157c6b14a70f6b921cbbd37aaeac5f1b35c0696217ebd16820148b0512510e7b2da89a2e3c9d28a50c312219dd9d300a04d68b3041"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cclicenses-doc"

RDEPENDS:${PN} += ""

inherit rpm
