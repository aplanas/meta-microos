SUMMARY = "Documentation for texlive-biblatex"
DESCRIPTION = "This package includes the documentation for texlive-biblatex"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.19svn66403"

RPM_NAME = "texlive-biblatex-doc-2023.201.3.19svn66403-53.1.noarch.rpm"
RPM_HASH = "31bf03a5c502e4a6b51b0a1062e2926133e733e54a5109d4edf4e77e386321288089c73c8ef0fd184ce73b1550f01b3ad822c01f3c63aa1cd2367de01bd4cb50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-biblatex-doc:en) \
texlive-biblatex-doc"
RDEPENDS:${PN} += ""

inherit rpm
