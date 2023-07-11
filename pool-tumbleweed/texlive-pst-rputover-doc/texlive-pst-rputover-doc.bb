SUMMARY = "Documentation for texlive-pst-rputover"
DESCRIPTION = "This package includes the documentation for texlive-pst-rputover"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn44724"

RPM_NAME = "texlive-pst-rputover-doc-2023.201.1.0svn44724-53.2.noarch.rpm"
RPM_HASH = "c31f3d567253a65fba39ce5d0dd92a78836f1b84e40d6655adfbcd8d881ebb442292719a641c4fcc876165cc7d821a2301cf46e08e41bc11d15c114fbaf5f878"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-rputover-doc"

RDEPENDS:${PN} += ""

inherit rpm
