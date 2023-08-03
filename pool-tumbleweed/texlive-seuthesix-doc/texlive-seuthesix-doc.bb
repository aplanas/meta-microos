SUMMARY = "Documentation for texlive-seuthesix"
DESCRIPTION = "This package includes the documentation for texlive-seuthesix"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0.1svn40088"

RPM_NAME = "texlive-seuthesix-doc-2023.209.1.0.1svn40088-54.1.noarch.rpm"
RPM_HASH = "0ce3a1aaa0deb55c6cf0bf2f68e3d76bb5aacac4a87bdbc5fb3adfb30b9cb2041a4d97864a25fc03f2b159efdd99e110a1ae4556a2e6d0cdba25b2ac00be04a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-seuthesix-doc-zh \
texlive-seuthesix-doc"

RDEPENDS:${PN} += ""

inherit rpm
