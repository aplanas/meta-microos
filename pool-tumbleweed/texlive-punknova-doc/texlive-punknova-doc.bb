SUMMARY = "Documentation for texlive-punknova"
DESCRIPTION = "This package includes the documentation for texlive-punknova"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.003svn24649"

RPM_NAME = "texlive-punknova-doc-2023.209.1.003svn24649-54.1.noarch.rpm"
RPM_HASH = "221b2113527f1bc31f25d666803621b31a5db87efb5270ec415b041ef11079e1dd6046d4db6c843f2cdf845c11f422be91aa491641a89721235bb197f3854dbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-punknova-doc"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
