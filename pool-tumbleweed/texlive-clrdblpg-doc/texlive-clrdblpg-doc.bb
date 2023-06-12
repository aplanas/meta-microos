SUMMARY = "Documentation for texlive-clrdblpg"
DESCRIPTION = "This package includes the documentation for texlive-clrdblpg"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn47511"

RPM_NAME = "texlive-clrdblpg-doc-2023.201.1.0svn47511-53.1.noarch.rpm"
RPM_HASH = "4b16472a9ce3aa7497130b64ebe818133306bdc93316201c873a1cf58ad541ac970d1bacb713bb5a2e057ba8f44f6a18fbe07e7bfa5460bc558057468e39caea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-clrdblpg-doc"
RDEPENDS:${PN} += ""

inherit rpm
