SUMMARY = "Documentation for texlive-luatexja"
DESCRIPTION = "This package includes the documentation for texlive-luatexja"
LICENSE = "BSD-3-Clause"

PV = "2023.201.20230211.0svn65790"

RPM_NAME = "texlive-luatexja-doc-2023.201.20230211.0svn65790-52.1.noarch.rpm"
RPM_HASH = "03b7016f016843485f32bb5fc0620de3df1649e17192312e45a12d0f14205b547539aef7a3b75e5e12202e61b16040ce9ad6994c6a7d2d384be10ba393a13cd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-luatexja-doc:en;ja) \
texlive-luatexja-doc"
RDEPENDS:${PN} += ""

inherit rpm
