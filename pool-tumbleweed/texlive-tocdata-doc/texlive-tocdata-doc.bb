SUMMARY = "Documentation for texlive-tocdata"
DESCRIPTION = "This package includes the documentation for texlive-tocdata"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.05svn65451"

RPM_NAME = "texlive-tocdata-doc-2023.209.2.05svn65451-53.1.noarch.rpm"
RPM_HASH = "89abbd046edcc0087f72a01c9da2b1981139c222a3d0ae832fff8cbe3ceb9d3599266a1f9f7d9046bb0c7fa3206306984ee3423042b4ba1ff632fa0fe1291b8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tocdata-doc"

RDEPENDS:${PN} += ""

inherit rpm
