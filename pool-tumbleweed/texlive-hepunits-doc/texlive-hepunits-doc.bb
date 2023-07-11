SUMMARY = "Documentation for texlive-hepunits"
DESCRIPTION = "This package includes the documentation for texlive-hepunits"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0.0svn54758"

RPM_NAME = "texlive-hepunits-doc-2023.201.2.0.0svn54758-53.2.noarch.rpm"
RPM_HASH = "af606b2a8455c32e5554abbdb123931408644873a35f343aab43d176a8b317f24cb301556610e0faaae450b401882f22769b2dedefaaf58bd39ccf9ed8955b27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hepunits-doc"

RDEPENDS:${PN} += ""

inherit rpm
