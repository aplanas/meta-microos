SUMMARY = "Documentation for texlive-pxrubrica"
DESCRIPTION = "This package includes the documentation for texlive-pxrubrica"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3esvn66298"

RPM_NAME = "texlive-pxrubrica-doc-2023.209.1.3esvn66298-54.1.noarch.rpm"
RPM_HASH = "95a3dd96d91525b67f179d6dee7b6b3db39c8dfc0f074b99ff605d14baeeeea182f42f7c292c300ff346e6e7616f686585b3c2156b33e2ab3db441168c08ab5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pxrubrica-doc-ja \
texlive-pxrubrica-doc"

RDEPENDS:${PN} += ""

inherit rpm
