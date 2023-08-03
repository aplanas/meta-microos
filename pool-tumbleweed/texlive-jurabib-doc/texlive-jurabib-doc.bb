SUMMARY = "Documentation for texlive-jurabib"
DESCRIPTION = "This package includes the documentation for texlive-jurabib"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.6svn15878"

RPM_NAME = "texlive-jurabib-doc-2023.209.0.0.6svn15878-56.1.noarch.rpm"
RPM_HASH = "d13e5894d624d9d5a658144ce32af9681c2282ccde353507554a90c7cc19b074404d3ebde1a6d4e7d86ba9ad13133585cd973e373cb2a1c9f67a9c5967a20245"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-jurabib-doc-en;de \
texlive-jurabib-doc"

RDEPENDS:${PN} += ""

inherit rpm
