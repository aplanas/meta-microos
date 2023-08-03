SUMMARY = "Documentation for texlive-babel-irish"
DESCRIPTION = "This package includes the documentation for texlive-babel-irish"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0hsvn30277"

RPM_NAME = "texlive-babel-irish-doc-2023.209.1.0hsvn30277-54.1.noarch.rpm"
RPM_HASH = "3d974138492681a57775913d4eecf1f4d269bdb299178ea21c3a2328314188e6263e3bba43ed2d9b3435098e15cf972015660037639444359768f7c766028746"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-irish-doc"

RDEPENDS:${PN} += ""

inherit rpm
