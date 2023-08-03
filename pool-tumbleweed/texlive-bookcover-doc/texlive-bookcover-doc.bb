SUMMARY = "Documentation for texlive-bookcover"
DESCRIPTION = "This package includes the documentation for texlive-bookcover"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.5svn65394"

RPM_NAME = "texlive-bookcover-doc-2023.209.3.5svn65394-53.1.noarch.rpm"
RPM_HASH = "092daf34d864aa01a13b65aa5c37d67f1325a37112e47e59a27e30eacec1bb30fca7f92b03c45377917860690832fa0278a61caab8d8fd5b5154ef12d85c2585"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bookcover-doc"

RDEPENDS:${PN} += ""

inherit rpm
