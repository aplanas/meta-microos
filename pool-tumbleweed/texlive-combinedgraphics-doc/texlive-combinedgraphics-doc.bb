SUMMARY = "Documentation for texlive-combinedgraphics"
DESCRIPTION = "This package includes the documentation for texlive-combinedgraphics"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.2.2svn27198"

RPM_NAME = "texlive-combinedgraphics-doc-2023.209.0.0.2.2svn27198-54.1.noarch.rpm"
RPM_HASH = "034367274f0e35e0512ca023acc4324524996ced0cca9fd6c1a48e5015eb0265e342ec88f5dcf1e4cd7aee3e7d45f525cdf267f40c08271d1a9bb4ac828ad657"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-combinedgraphics-doc"

RDEPENDS:${PN} += ""

inherit rpm
