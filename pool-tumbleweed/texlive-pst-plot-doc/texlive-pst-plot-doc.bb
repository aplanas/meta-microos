SUMMARY = "Documentation for texlive-pst-plot"
DESCRIPTION = "This package includes the documentation for texlive-pst-plot"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.94svn65346"

RPM_NAME = "texlive-pst-plot-doc-2023.201.1.94svn65346-53.1.noarch.rpm"
RPM_HASH = "c0dd4408db33badef560f1a545c3ed7182c9e3753d2d83d5f37a1220b44f2fb5f3597db1d97a7198099bf29de9eff5203238199d7b5e43412c5742a8451941b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-pst-plot-doc:en) \
texlive-pst-plot-doc"

RDEPENDS:${PN} += ""

inherit rpm
