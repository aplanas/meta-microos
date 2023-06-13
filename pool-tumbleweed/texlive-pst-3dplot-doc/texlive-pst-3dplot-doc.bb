SUMMARY = "Documentation for texlive-pst-3dplot"
DESCRIPTION = "This package includes the documentation for texlive-pst-3dplot"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.07asvn61615"

RPM_NAME = "texlive-pst-3dplot-doc-2023.201.2.07asvn61615-52.1.noarch.rpm"
RPM_HASH = "88b7d0a37f1db56486851f041cefaa20e3108e12d6c291b1fbf5a9da07fb49f3314e94b63776b949d8e273675669db361528fbef543ee097ef1a52ae75ef84f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-3dplot-doc"

RDEPENDS:${PN} += ""

inherit rpm
