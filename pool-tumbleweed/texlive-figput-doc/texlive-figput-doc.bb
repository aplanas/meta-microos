SUMMARY = "Documentation for texlive-figput"
DESCRIPTION = "This package includes the documentation for texlive-figput"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.90svn63957"

RPM_NAME = "texlive-figput-doc-2023.209.0.0.90svn63957-53.1.noarch.rpm"
RPM_HASH = "16461bb7d4464217ff771cb58ed29550d1ca4ad928c77a719fb85f9d0015cf5f1edf98b70fe0a069dbfb244385bcb16dfd01396c4097ad592ebb86d774711575"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-figput-doc"

RDEPENDS:${PN} += ""

inherit rpm
