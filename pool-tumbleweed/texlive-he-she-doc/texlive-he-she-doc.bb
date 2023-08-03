SUMMARY = "Documentation for texlive-he-she"
DESCRIPTION = "This package includes the documentation for texlive-he-she"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn41359"

RPM_NAME = "texlive-he-she-doc-2023.209.1.3svn41359-54.1.noarch.rpm"
RPM_HASH = "f6f03082fa92364c30fcae49fe753609debeb37d28b6ed6db89e4cd734a2104d31c935038c579335213c91d20dc6385741afc289d31b1ab7a445c06e0491e213"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-he-she-doc"

RDEPENDS:${PN} += ""

inherit rpm
