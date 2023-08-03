SUMMARY = "Documentation for texlive-tikz-3dplot"
DESCRIPTION = "This package includes the documentation for texlive-tikz-3dplot"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn25087"

RPM_NAME = "texlive-tikz-3dplot-doc-2023.209.svn25087-55.1.noarch.rpm"
RPM_HASH = "7c28b60a605b453351c1f9161cfbf107ee4b362f3d1726d9e9449855b5b18d2f592dd60871195fe68185602cad50c324383d264022bf5f413eaf8d7f4daf72ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-3dplot-doc"

RDEPENDS:${PN} += ""

inherit rpm
