SUMMARY = "Documentation for texlive-halloweenmath"
DESCRIPTION = "This package includes the documentation for texlive-halloweenmath"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.11svn52602"

RPM_NAME = "texlive-halloweenmath-doc-2023.209.0.0.11svn52602-54.2.noarch.rpm"
RPM_HASH = "2af4c14b9d882c3b1083d57b941ca1ac24000647044d982f88aead917c7305627fcf28b17c56873bb41c9ef54f80247a9c7c9f0e48a67c2516189986ef0fef6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-halloweenmath-doc"

RDEPENDS:${PN} += ""

inherit rpm
