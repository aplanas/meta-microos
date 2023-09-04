SUMMARY = "Documentation for texlive-hepunits"
DESCRIPTION = "This package includes the documentation for texlive-hepunits"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0.0svn54758"

RPM_NAME = "texlive-hepunits-doc-2023.209.2.0.0svn54758-54.2.noarch.rpm"
RPM_HASH = "a025f2491427fad80e291b9818177628734ef2b2ce3fc96131e7d10f14cce97617119e7e485bc7b87c4a3b7d2b71b38bf89da2bad1a0c770579398c22a24af13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hepunits-doc"

RDEPENDS:${PN} += ""

inherit rpm
