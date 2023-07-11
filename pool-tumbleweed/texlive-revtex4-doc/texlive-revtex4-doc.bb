SUMMARY = "Documentation for texlive-revtex4"
DESCRIPTION = "This package includes the documentation for texlive-revtex4"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.0asvn56589"

RPM_NAME = "texlive-revtex4-doc-2023.201.4.0asvn56589-53.2.noarch.rpm"
RPM_HASH = "f9be22373dab1c7aaf31bc9a7ffab543c4b878c6782cd67ab9315d291c39d250eee0245d86e9b9389b255794ae638cb1ed90d2af9ad381385c8a69063bb26ff6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-revtex4-doc"

RDEPENDS:${PN} += ""

inherit rpm
