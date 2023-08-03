SUMMARY = "Documentation for texlive-qsharp"
DESCRIPTION = "This package includes the documentation for texlive-qsharp"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3.1901.1401svn49722"

RPM_NAME = "texlive-qsharp-doc-2023.209.0.0.3.1901.1401svn49722-54.1.noarch.rpm"
RPM_HASH = "718b23bc3d7f0af83ea815baccc2e07e75a7a3c408ca67cdc8708458a015a612954e7c9e93e55c52e7b2dce813b42f232c71b9526b71addf42136b5b5764ff77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qsharp-doc"

RDEPENDS:${PN} += ""

inherit rpm
