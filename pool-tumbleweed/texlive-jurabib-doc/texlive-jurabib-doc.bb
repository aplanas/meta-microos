SUMMARY = "Documentation for texlive-jurabib"
DESCRIPTION = "This package includes the documentation for texlive-jurabib"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.6svn15878"

RPM_NAME = "texlive-jurabib-doc-2023.201.0.0.6svn15878-55.1.noarch.rpm"
RPM_HASH = "8e44f4b28a55e350307a12e5219dc3a7d21990d940e9036b83fb6ac7c48dbc4555cfdc470361bbe43b8c4a089ac4729dc10bf879a8417a64f37995c69c94b292"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-jurabib-doc-en;de \
texlive-jurabib-doc"

RDEPENDS:${PN} += ""

inherit rpm
