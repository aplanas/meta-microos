SUMMARY = "Documentation for texlive-typogrid"
DESCRIPTION = "This package includes the documentation for texlive-typogrid"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.21svn24994"

RPM_NAME = "texlive-typogrid-doc-2023.209.0.0.21svn24994-53.1.noarch.rpm"
RPM_HASH = "cb6e2b14a485c4cdb7568ecfe62585848bb5f55ed0bfc1b039ccd4166b29f9b4424a75274eea619a2029129c040f058a09256563651288b320ab616594078836"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-typogrid-doc"

RDEPENDS:${PN} += ""

inherit rpm
