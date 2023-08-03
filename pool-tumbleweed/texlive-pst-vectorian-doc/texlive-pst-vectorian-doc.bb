SUMMARY = "Documentation for texlive-pst-vectorian"
DESCRIPTION = "This package includes the documentation for texlive-pst-vectorian"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.41svn60488"

RPM_NAME = "texlive-pst-vectorian-doc-2023.209.0.0.41svn60488-54.1.noarch.rpm"
RPM_HASH = "e59103aa28dc388512f8fbfd889c3cde38211bc905f192be02ff2a8b30992993ecdcb7969d8a917d60f66b794371ef521b98c56ed5bc0b6ac397c58ac0aad444"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-vectorian-doc-fr \
texlive-pst-vectorian-doc"

RDEPENDS:${PN} += ""

inherit rpm
