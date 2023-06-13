SUMMARY = "Documentation for texlive-latex-papersize"
DESCRIPTION = "This package includes the documentation for texlive-latex-papersize"
LICENSE = "Apache-1.0"

PV = "2023.201.1.63svn53131"

RPM_NAME = "texlive-latex-papersize-doc-2023.201.1.63svn53131-55.1.noarch.rpm"
RPM_HASH = "6fa5e7d067742414747cdf9f4e062e209f26ba4f42e815447cd82ec40050e22be87785103dc0acdb786035d8001191aaef713561ec4ad3acd1188627f1d13795"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-papersize-doc"

RDEPENDS:${PN} += ""

inherit rpm
