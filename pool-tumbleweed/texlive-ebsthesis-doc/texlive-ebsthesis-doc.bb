SUMMARY = "Documentation for texlive-ebsthesis"
DESCRIPTION = "This package includes the documentation for texlive-ebsthesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-ebsthesis-doc-2023.209.1.0svn15878-54.2.noarch.rpm"
RPM_HASH = "94bc00a9985afabc5eec73707a9d8218520832b0d5a1e5ccb397272ea93ffbdb268346f725aea3f6b15f32cc5d9dbc61c68e98d1c47591c5f7fab70727e9af98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ebsthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
