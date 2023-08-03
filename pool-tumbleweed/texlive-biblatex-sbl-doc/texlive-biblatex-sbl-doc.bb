SUMMARY = "Documentation for texlive-biblatex-sbl"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-sbl"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.14svn63639"

RPM_NAME = "texlive-biblatex-sbl-doc-2023.209.0.0.14svn63639-54.1.noarch.rpm"
RPM_HASH = "1af70445c5997dfc7d4d02ae09782e642c48432f29ccdcf50b42b5e90d34a35ae3d5c7d872fd52a59be55cc81b11a046a90245fb1e5fefba27e770c62caab86e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-sbl-doc"

RDEPENDS:${PN} += ""

inherit rpm
