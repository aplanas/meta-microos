SUMMARY = "Documentation for texlive-texdiff"
DESCRIPTION = "This package includes the documentation for texlive-texdiff"
LICENSE = "Artistic-1.0"

PV = "2023.201.0.0.4svn29752"

RPM_NAME = "texlive-texdiff-doc-2023.201.0.0.4svn29752-54.1.noarch.rpm"
RPM_HASH = "2949cde58faffad210fd5e9e5de76b7226135d0fea3a2b1a821fa042917db699077faba963935a409943abe0626d4168c125bc770ea4cde7e69a097e7d2bea31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-texdiff.1 \
texlive-texdiff-doc"

RDEPENDS:${PN} += ""

inherit rpm
