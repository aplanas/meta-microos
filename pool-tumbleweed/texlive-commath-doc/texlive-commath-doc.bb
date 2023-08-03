SUMMARY = "Documentation for texlive-commath"
DESCRIPTION = "This package includes the documentation for texlive-commath"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn15878"

RPM_NAME = "texlive-commath-doc-2023.209.0.0.3svn15878-54.1.noarch.rpm"
RPM_HASH = "cfff128120c03c594219b24e79912bade0ea2c2cea5164082554ee92bfd09f61fae97137a0aa472d8423db1a9a967bb432d8b6c42913a920fe02debfc749bbeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-commath-doc"

RDEPENDS:${PN} += ""

inherit rpm
