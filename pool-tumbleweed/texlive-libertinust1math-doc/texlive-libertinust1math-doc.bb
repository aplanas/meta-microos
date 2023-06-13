SUMMARY = "Documentation for texlive-libertinust1math"
DESCRIPTION = "This package includes the documentation for texlive-libertinust1math"
LICENSE = "OFL-1.1"

PV = "2023.201.2.0.2svn61751"

RPM_NAME = "texlive-libertinust1math-doc-2023.201.2.0.2svn61751-54.1.noarch.rpm"
RPM_HASH = "1726a471b2caa28fc315c675c9198f063bf0bb814a1c56e9ff8c2ba29ead1b4e6a5e3535e93008228c674287fb2e48d23a341e61ad8a3c9acbd7ab10918cc746"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-libertinust1math-doc"

RDEPENDS:${PN} += ""

inherit rpm
