SUMMARY = "Documentation for texlive-spalign"
DESCRIPTION = "This package includes the documentation for texlive-spalign"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn42225"

RPM_NAME = "texlive-spalign-doc-2023.201.svn42225-57.1.noarch.rpm"
RPM_HASH = "e10d3a09d2439a3cafbc0392941d8a0f1b3db14c3b746eafc5ea86ef6ffff5c898cc3bf6a6f0d88c7ef487b279fbdfd0ee1e93df7e956521c111efd0ab004e91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-spalign-doc"

RDEPENDS:${PN} += ""

inherit rpm
