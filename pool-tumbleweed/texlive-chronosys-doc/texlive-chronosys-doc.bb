SUMMARY = "Documentation for texlive-chronosys"
DESCRIPTION = "This package includes the documentation for texlive-chronosys"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn26700"

RPM_NAME = "texlive-chronosys-doc-2023.201.1.2svn26700-53.1.noarch.rpm"
RPM_HASH = "f5a54758de343c250f6fd091611b52598bd380e16cdc6fb05e3cb84c0eb23c2fd99552b1e6c5571f59019caf3995db84da131f14075fa644ddfcda9fb291faab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-chronosys-doc:en;fr) \
texlive-chronosys-doc"

RDEPENDS:${PN} += ""

inherit rpm
