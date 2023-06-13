SUMMARY = "Documentation for texlive-uniquecounter"
DESCRIPTION = "This package includes the documentation for texlive-uniquecounter"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn53162"

RPM_NAME = "texlive-uniquecounter-doc-2023.201.1.4svn53162-53.1.noarch.rpm"
RPM_HASH = "631f14e2a166524dc0874bd395fd0257ed4b3abd5a7e28cebe7a43831f6ed33feb622f80212123cbe18efdd4b0a40130b90aff4d20d19de979312960b1012710"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uniquecounter-doc"

RDEPENDS:${PN} += ""

inherit rpm
