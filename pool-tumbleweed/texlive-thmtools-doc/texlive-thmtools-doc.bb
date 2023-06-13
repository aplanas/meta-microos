SUMMARY = "Documentation for texlive-thmtools"
DESCRIPTION = "This package includes the documentation for texlive-thmtools"
LICENSE = "LPPL-1.0"

PV = "2023.201.75svn65863"

RPM_NAME = "texlive-thmtools-doc-2023.201.75svn65863-54.1.noarch.rpm"
RPM_HASH = "177ab83d79031c4484246b042d24554512840469ef60ffc0dbf4dce80d253e3b1e907611234bf0909011306eb4c8601495e4b0420c9cc4ca6455ff0790799ff1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-thmtools-doc"

RDEPENDS:${PN} += ""

inherit rpm
