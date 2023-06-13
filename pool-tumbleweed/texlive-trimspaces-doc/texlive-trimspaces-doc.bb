SUMMARY = "Documentation for texlive-trimspaces"
DESCRIPTION = "This package includes the documentation for texlive-trimspaces"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn15878"

RPM_NAME = "texlive-trimspaces-doc-2023.201.1.1svn15878-52.1.noarch.rpm"
RPM_HASH = "c18875b8c6c169ac8b42ddb68b8a1a130f005a0069c62821895374239db14ca0a755502775d13813a37b7fbf35708364ca0842d94b4ad9baf5164d25dfc6cbda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-trimspaces-doc"

RDEPENDS:${PN} += ""

inherit rpm
