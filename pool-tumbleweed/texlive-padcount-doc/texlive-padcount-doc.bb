SUMMARY = "Documentation for texlive-padcount"
DESCRIPTION = "This package includes the documentation for texlive-padcount"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn47621"

RPM_NAME = "texlive-padcount-doc-2023.209.1.0svn47621-52.1.noarch.rpm"
RPM_HASH = "c65fe482694930413fc113c687603e91e9371cd6ce42ec9da4a9f88967253b81ada136e769f14c11a4adda57895f92a50d3017addfc9bd5fc3c35841baad518f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-padcount-doc"

RDEPENDS:${PN} += ""

inherit rpm
