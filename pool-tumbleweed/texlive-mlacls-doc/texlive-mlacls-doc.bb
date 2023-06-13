SUMMARY = "Documentation for texlive-mlacls"
DESCRIPTION = "This package includes the documentation for texlive-mlacls"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn60508"

RPM_NAME = "texlive-mlacls-doc-2023.201.1.0svn60508-54.1.noarch.rpm"
RPM_HASH = "6b50952ebe0ca43b3be78633d978ced9e3aebec13d7ef93e7c095dae438bbff56dda04a2c20b683d99d0ec5d1f0ece0a8e57c97cecfb0fd94da04286bcd9b55d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mlacls-doc"

RDEPENDS:${PN} += ""

inherit rpm
