SUMMARY = "Documentation for texlive-zref-clever"
DESCRIPTION = "This package includes the documentation for texlive-zref-clever"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3.6svn66021"

RPM_NAME = "texlive-zref-clever-doc-2023.209.0.0.3.6svn66021-53.1.noarch.rpm"
RPM_HASH = "bffb01a57afdc117f05113f3166c6b527811464fe1ce8d9954d6711b705ae67f52bfb3b7faf6eb612cdd32d02e688fab12c6b78012c1bf44f3c395c889587240"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zref-clever-doc"

RDEPENDS:${PN} += ""

inherit rpm
