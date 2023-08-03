SUMMARY = "Documentation for texlive-hep-font"
DESCRIPTION = "This package includes the documentation for texlive-hep-font"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn64900"

RPM_NAME = "texlive-hep-font-doc-2023.209.1.1svn64900-54.1.noarch.rpm"
RPM_HASH = "35e0db8fc89a21636653e44e0f8e5ef1ba4c1f0e32d414c557581d6f259a576bdcbd33b77d67c086c65d0a9a1cbd6002622e62a3a26cde7be80570964a08a138"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-font-doc"

RDEPENDS:${PN} += ""

inherit rpm
