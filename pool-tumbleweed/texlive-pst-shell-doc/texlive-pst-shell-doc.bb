SUMMARY = "Documentation for texlive-pst-shell"
DESCRIPTION = "This package includes the documentation for texlive-pst-shell"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.03svn56070"

RPM_NAME = "texlive-pst-shell-doc-2023.209.0.0.03svn56070-54.1.noarch.rpm"
RPM_HASH = "638069b9df6923d2dd64d82278a1d0e510958442ee1af4fa9b3f2bff47b5935013c60297b18e69e640538cc0716bf970553e98a72e5c50e5174ceb6c7a0a1884"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-shell-doc"

RDEPENDS:${PN} += ""

inherit rpm
