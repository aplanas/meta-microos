SUMMARY = "Documentation for texlive-cluttex"
DESCRIPTION = "This package includes the documentation for texlive-cluttex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.5.1svn60964"

RPM_NAME = "texlive-cluttex-doc-2023.201.0.0.5.1svn60964-53.1.noarch.rpm"
RPM_HASH = "339c375181ba709c1faff5b8f5cf7c864dbc5d997011dcc8d82ed08db9a0aa3256850b7d3448c56b431f6cc6239092ba669704a115953623e4ca46ff9834becc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-cluttex-doc:ja;en) \
texlive-cluttex-doc"

RDEPENDS:${PN} += "/usr/bin/texlua"

inherit rpm
