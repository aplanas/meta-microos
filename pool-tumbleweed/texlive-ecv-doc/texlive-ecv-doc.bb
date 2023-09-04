SUMMARY = "Documentation for texlive-ecv"
DESCRIPTION = "This package includes the documentation for texlive-ecv"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn24928"

RPM_NAME = "texlive-ecv-doc-2023.209.0.0.3svn24928-54.2.noarch.rpm"
RPM_HASH = "0ab1af0309d5784a309f07739defd5dd767ea824e7efe42e6a0955814de14ede8d8a2325e3d18a95f17fb5f7b82013581f30361a58d699526472adbe39491339"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-ecv-doc-de;en \
texlive-ecv-doc"

RDEPENDS:${PN} += ""

inherit rpm
