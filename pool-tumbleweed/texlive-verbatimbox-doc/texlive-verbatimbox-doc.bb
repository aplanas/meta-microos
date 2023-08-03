SUMMARY = "Documentation for texlive-verbatimbox"
DESCRIPTION = "This package includes the documentation for texlive-verbatimbox"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.13svn33197"

RPM_NAME = "texlive-verbatimbox-doc-2023.209.3.13svn33197-54.1.noarch.rpm"
RPM_HASH = "aadbdea65e040d85065a80f020ee51e76a93431004cc51800719ebc3c34efcd802bcd2ddbe5e232b18bce8d457f34ee07cf5ddc7a9403ee7e244f6baeabfbeb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-verbatimbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
