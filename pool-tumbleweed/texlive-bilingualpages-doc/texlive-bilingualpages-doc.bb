SUMMARY = "Documentation for texlive-bilingualpages"
DESCRIPTION = "This package includes the documentation for texlive-bilingualpages"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.0svn59643"

RPM_NAME = "texlive-bilingualpages-doc-2023.209.1.0.0svn59643-54.1.noarch.rpm"
RPM_HASH = "e9bb839ac443a508828a2cb6ce3575e028accbc8382a49e4108707c002582c889d8622cd9d2eab819f69dec58c9181af2eb09003345c0c98fae83e5423299485"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bilingualpages-doc"

RDEPENDS:${PN} += ""

inherit rpm
