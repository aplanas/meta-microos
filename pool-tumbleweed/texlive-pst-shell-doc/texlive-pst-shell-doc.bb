SUMMARY = "Documentation for texlive-pst-shell"
DESCRIPTION = "This package includes the documentation for texlive-pst-shell"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.03svn56070"

RPM_NAME = "texlive-pst-shell-doc-2023.201.0.0.03svn56070-53.2.noarch.rpm"
RPM_HASH = "cbff3a9901155db44e7ecfd7d47d22bbd6bc9e8ebdebcfb77ee7b671be8e18c411cdab017fe3c75ae107eccb891c49b1388f50029443a65ed58506134327eccc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-shell-doc"

RDEPENDS:${PN} += ""

inherit rpm
