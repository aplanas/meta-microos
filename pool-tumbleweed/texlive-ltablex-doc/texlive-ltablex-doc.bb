SUMMARY = "Documentation for texlive-ltablex"
DESCRIPTION = "This package includes the documentation for texlive-ltablex"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.1svn34923"

RPM_NAME = "texlive-ltablex-doc-2023.208.1.1svn34923-53.1.noarch.rpm"
RPM_HASH = "9732a84804733f11b0348f531948901ff112900fe5a262d0b3c011dbb5d6e10e12c28217b6efc93d3c335e08174be28ca9e973c1207a34e42b806b45b9766583"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ltablex-doc"

RDEPENDS:${PN} += ""

inherit rpm
