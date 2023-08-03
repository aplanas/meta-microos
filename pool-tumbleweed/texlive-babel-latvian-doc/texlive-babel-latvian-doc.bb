SUMMARY = "Documentation for texlive-babel-latvian"
DESCRIPTION = "This package includes the documentation for texlive-babel-latvian"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0bsvn46681"

RPM_NAME = "texlive-babel-latvian-doc-2023.209.2.0bsvn46681-54.1.noarch.rpm"
RPM_HASH = "6837d2882468c2b18854eb71614bec3e5f33ad6cb9373af1f434f406bbd0a96dfd46e5ddbb75c5400e4896da7d9c37acd8d43e7513fbd58f378e65ca789f3728"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-latvian-doc"

RDEPENDS:${PN} += ""

inherit rpm
