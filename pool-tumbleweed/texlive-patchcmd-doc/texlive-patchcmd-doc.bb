SUMMARY = "Documentation for texlive-patchcmd"
DESCRIPTION = "This package includes the documentation for texlive-patchcmd"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.05svn41379"

RPM_NAME = "texlive-patchcmd-doc-2023.209.1.05svn41379-52.1.noarch.rpm"
RPM_HASH = "20c962198251d6e74408459b635414c9e932062c0e2ce4d5672614fe9b982d457c95860c293c692d1693267963b66b994a6697e115c1559944efc380f271f91a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-patchcmd-doc"

RDEPENDS:${PN} += ""

inherit rpm
