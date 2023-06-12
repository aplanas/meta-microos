SUMMARY = "Documentation for texlive-minim-math"
DESCRIPTION = "This package includes the documentation for texlive-minim-math"
LICENSE = "LPPL-1.0"

PV = "2023.201.2023_1.2svn66395"

RPM_NAME = "texlive-minim-math-doc-2023.201.2023_1.2svn66395-54.1.noarch.rpm"
RPM_HASH = "5d0c7ee46bca06e4322db83bc7b3c00794976cfd919f41bb2ba1f43e95d1a947af04a594c8ce69b631f4f2e618089283d1fa34dfedb411e29ab6f5b5341d9d82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-minim-math-doc"
RDEPENDS:${PN} += ""

inherit rpm
