SUMMARY = "Documentation for texlive-datatool"
DESCRIPTION = "This package includes the documentation for texlive-datatool"
LICENSE = "LPPL-1.0"

PV = "2023.204.2.32svn52663"

RPM_NAME = "texlive-datatool-doc-2023.204.2.32svn52663-54.1.noarch.rpm"
RPM_HASH = "b0128864ff8f68dbb7a44393fbd498ad2e0eb2b5355a8101c858fccba9b92775c0d10047da44bc9e4e09314c0d298bb76bf2cac5b0be7a7598c2170c1f5ac98c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datatool-doc"
RDEPENDS:${PN} += ""

inherit rpm
