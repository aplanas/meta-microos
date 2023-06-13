SUMMARY = "Documentation for texlive-babel-greek"
DESCRIPTION = "This package includes the documentation for texlive-babel-greek"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.12svn66346"

RPM_NAME = "texlive-babel-greek-doc-2023.201.1.12svn66346-53.1.noarch.rpm"
RPM_HASH = "07d0275a2d60a37b9c172e78904f2c93e7f47d0ca328f64ae6604e2d4a03fff73c680bea511c1fb1274b9467e10bcfa6a120a34ccead99501382e9d3f3d3bdc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-greek-doc"

RDEPENDS:${PN} += ""

inherit rpm
