SUMMARY = "Documentation for texlive-tdsfrmath"
DESCRIPTION = "This package includes the documentation for texlive-tdsfrmath"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn15878"

RPM_NAME = "texlive-tdsfrmath-doc-2023.201.1.3svn15878-54.1.noarch.rpm"
RPM_HASH = "3b18a0b996103641b069abf8065baf049b78060be14f272e1dee743fba21e9103074b8a58a78ea70dd5f50e5765d11b253d3f83fb285818ec1267f8c9fc13296"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tdsfrmath-doc-fr;en \
texlive-tdsfrmath-doc"

RDEPENDS:${PN} += ""

inherit rpm
