SUMMARY = "Documentation for texlive-zhmetrics-uptex"
DESCRIPTION = "This package includes the documentation for texlive-zhmetrics-uptex"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn40728"

RPM_NAME = "texlive-zhmetrics-uptex-doc-2023.201.1.0svn40728-52.1.noarch.rpm"
RPM_HASH = "85bfe61166fa72333e5c922dd77477743512b4e51a35218d8bc5751528281049f05783f92e79cb2e857724845f93980b49e2be51f9dda4ee8cf559989376b867"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zhmetrics-uptex-doc"

RDEPENDS:${PN} += "/usr/bin/texlua"

inherit rpm
