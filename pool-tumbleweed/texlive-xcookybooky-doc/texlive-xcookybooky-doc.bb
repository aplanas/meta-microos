SUMMARY = "Documentation for texlive-xcookybooky"
DESCRIPTION = "This package includes the documentation for texlive-xcookybooky"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn36435"

RPM_NAME = "texlive-xcookybooky-doc-2023.209.1.5svn36435-53.1.noarch.rpm"
RPM_HASH = "d16b09d56870c78a5f0abdbc871363641fe3a70ad5d584ff29e0e099a23975873227042b9d3621bde60ffb2a35d31202654929d628435d918e8a92c10900d115"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xcookybooky-doc"

RDEPENDS:${PN} += ""

inherit rpm
