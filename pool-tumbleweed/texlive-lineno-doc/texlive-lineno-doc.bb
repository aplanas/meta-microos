SUMMARY = "Documentation for texlive-lineno"
DESCRIPTION = "This package includes the documentation for texlive-lineno"
LICENSE = "LPPL-1.0"

PV = "2023.201.5.1svn65586"

RPM_NAME = "texlive-lineno-doc-2023.201.5.1svn65586-54.1.noarch.rpm"
RPM_HASH = "bd06da67e4b0de9d315bd87ed9c090554342eff9a0c33081a4c85ded28fca2e2712935013b450857c3e21f988bef50b2aa67e2f07693581242ad61d6d18b5194"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lineno-doc"
RDEPENDS:${PN} += ""

inherit rpm
