SUMMARY = "Documentation for texlive-dowith"
DESCRIPTION = "This package includes the documentation for texlive-dowith"
LICENSE = "LPPL-1.0"

PV = "2023.209.r0.32svn38860"

RPM_NAME = "texlive-dowith-doc-2023.209.r0.32svn38860-53.1.noarch.rpm"
RPM_HASH = "f98946824eb4db20e6797e8d95d71e111d0f703ac96f7bc761b5ccefc0514f03dd3637f0181b24a0f1f227a1abc5f87a6bb786e119ee06c220da6708b20d3604"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dowith-doc"

RDEPENDS:${PN} += ""

inherit rpm
