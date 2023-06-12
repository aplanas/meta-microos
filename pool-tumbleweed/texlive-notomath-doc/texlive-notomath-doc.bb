SUMMARY = "Documentation for texlive-notomath"
DESCRIPTION = "This package includes the documentation for texlive-notomath"
LICENSE = "OFL-1.1"

PV = "2023.201.1.02svn58726"

RPM_NAME = "texlive-notomath-doc-2023.201.1.02svn58726-54.1.noarch.rpm"
RPM_HASH = "390e25a675fe3b04199e3632e2674ce8443bef0a1b178a01e02d89334600a682511a56bf5af507ebae3c971079536647561f9c912f71cf9607997e4f6fd128af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-notomath-doc"
RDEPENDS:${PN} += ""

inherit rpm
