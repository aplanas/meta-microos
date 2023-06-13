SUMMARY = "Documentation for texlive-etsvthor"
DESCRIPTION = "This package includes the documentation for texlive-etsvthor"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn48186"

RPM_NAME = "texlive-etsvthor-doc-2023.201.1.0svn48186-52.1.noarch.rpm"
RPM_HASH = "e4263e051baf4229c267cdd492499db24abc48d794a1055b3e5ebbe4ec1d1e79eaf8d642097ef99f759dee7dc52821c639418eb4d8468220e484cc3da1bcf8cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-etsvthor-doc"

RDEPENDS:${PN} += ""

inherit rpm
