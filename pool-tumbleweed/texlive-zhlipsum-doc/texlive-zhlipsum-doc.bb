SUMMARY = "Documentation for texlive-zhlipsum"
DESCRIPTION = "This package includes the documentation for texlive-zhlipsum"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2.0svn54994"

RPM_NAME = "texlive-zhlipsum-doc-2023.209.1.2.0svn54994-53.1.noarch.rpm"
RPM_HASH = "5acbdad3cfec498f68d28c46d34bc93bc96e859a9b169535bd9f71c5d896f8e5ae7a82f9b4b0eed1e9333d3f9e7cc48a54908bb2a2e77d0958f642fd6804dbb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-zhlipsum-doc-en;zh \
texlive-zhlipsum-doc"

RDEPENDS:${PN} += ""

inherit rpm
