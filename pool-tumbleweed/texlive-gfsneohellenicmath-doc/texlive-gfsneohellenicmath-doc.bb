SUMMARY = "Documentation for texlive-gfsneohellenicmath"
DESCRIPTION = "This package includes the documentation for texlive-gfsneohellenicmath"
LICENSE = "OFL-1.1"

PV = "2023.201.1.02svn63928"

RPM_NAME = "texlive-gfsneohellenicmath-doc-2023.201.1.02svn63928-52.1.noarch.rpm"
RPM_HASH = "c10dda2d6a92f50b75ff8c064bd4d42470a61ea3155be4cbdf77155bfafd1c69835486632065928c450048ee4f1d7132d313cee6808221eda418afb4d427b1a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gfsneohellenicmath-doc"
RDEPENDS:${PN} += ""

inherit rpm
