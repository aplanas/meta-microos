SUMMARY = "Documentation for texlive-statex2"
DESCRIPTION = "This package includes the documentation for texlive-statex2"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn23961"

RPM_NAME = "texlive-statex2-doc-2023.209.2.1svn23961-58.1.noarch.rpm"
RPM_HASH = "991a1431d675ec03a3a0e7b61ae6961a940696554dbbf917dfd62de925b3bf65256479978d41bab46d207a097e36d4dfa9795f612721e1a2b5fc968212f3b389"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-statex2-doc"

RDEPENDS:${PN} += ""

inherit rpm
