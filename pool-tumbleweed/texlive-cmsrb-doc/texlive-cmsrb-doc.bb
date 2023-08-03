SUMMARY = "Documentation for texlive-cmsrb"
DESCRIPTION = "This package includes the documentation for texlive-cmsrb"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.4.0svn54706"

RPM_NAME = "texlive-cmsrb-doc-2023.209.4.0svn54706-54.1.noarch.rpm"
RPM_HASH = "bc2b37e2ae84816a9e31e3a824bd4ccbd4b4457786af082125bcc8bad14aa44f52ad790e7b3d2664b4887242aa2ec6def12098fe6495cc6028015f0c3c361ba4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-cmsrb-doc-sr \
texlive-cmsrb-doc"

RDEPENDS:${PN} += ""

inherit rpm
