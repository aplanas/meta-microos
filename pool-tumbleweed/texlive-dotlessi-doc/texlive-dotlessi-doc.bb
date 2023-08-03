SUMMARY = "Documentation for texlive-dotlessi"
DESCRIPTION = "This package includes the documentation for texlive-dotlessi"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn51476"

RPM_NAME = "texlive-dotlessi-doc-2023.209.1.1svn51476-53.1.noarch.rpm"
RPM_HASH = "15b5600a981ec7a57ecce41b6f186e077c05c8383ed9cd74465b81079db261fb9a5b28df2eac3c1e4aea1b4291774a1ee0f2e294aefa857a257492f5921f7746"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dotlessi-doc"

RDEPENDS:${PN} += ""

inherit rpm
