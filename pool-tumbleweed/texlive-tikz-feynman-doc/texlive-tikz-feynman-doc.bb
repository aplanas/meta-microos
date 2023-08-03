SUMMARY = "Documentation for texlive-tikz-feynman"
DESCRIPTION = "This package includes the documentation for texlive-tikz-feynman"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.0svn56615"

RPM_NAME = "texlive-tikz-feynman-doc-2023.209.1.1.0svn56615-53.1.noarch.rpm"
RPM_HASH = "5964ab027993aa74567e8f6c2397bf98acba4ae7d92132cbd3b983d549c37d5a0e4b293a74b8607aef87ec2ed1974d530e75ed3a3e0e74a1f12686c4006434c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-feynman-doc"

RDEPENDS:${PN} += ""

inherit rpm
