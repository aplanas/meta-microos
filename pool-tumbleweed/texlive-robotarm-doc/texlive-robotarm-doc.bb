SUMMARY = "Documentation for texlive-robotarm"
DESCRIPTION = "This package includes the documentation for texlive-robotarm"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn63116"

RPM_NAME = "texlive-robotarm-doc-2023.209.0.0.1svn63116-54.1.noarch.rpm"
RPM_HASH = "6288f471d4969b9cf4d90dfccf09d907c1ae3f76edb7afbc60fc1909c7856299005ee76feda75672a1f034414b75e6af5a067e13df4c3324a9c4583e11daf974"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-robotarm-doc"

RDEPENDS:${PN} += ""

inherit rpm
