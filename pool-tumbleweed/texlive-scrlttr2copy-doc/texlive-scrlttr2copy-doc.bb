SUMMARY = "Documentation for texlive-scrlttr2copy"
DESCRIPTION = "This package includes the documentation for texlive-scrlttr2copy"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3asvn56733"

RPM_NAME = "texlive-scrlttr2copy-doc-2023.201.0.0.3asvn56733-53.1.noarch.rpm"
RPM_HASH = "ff62d75773753590400f92dd3e099f7e2cc5f52eb15ef0ffe34de7c4bacf22a9ea3a962e787eeb126e504794ecef7be8197da64e9a94dd849a67fbabb381401e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scrlttr2copy-doc"
RDEPENDS:${PN} += ""

inherit rpm
