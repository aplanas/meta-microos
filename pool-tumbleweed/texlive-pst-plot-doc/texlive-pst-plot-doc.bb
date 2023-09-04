SUMMARY = "Documentation for texlive-pst-plot"
DESCRIPTION = "This package includes the documentation for texlive-pst-plot"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.94svn65346"

RPM_NAME = "texlive-pst-plot-doc-2023.209.1.94svn65346-54.2.noarch.rpm"
RPM_HASH = "245933456bffd39e2685b628af95c17b0c4e3ea1001d774117527387aff2712898bce3ebd59b1067a5ebe2effc5e795b80df25fb7dabf35367906a1d38e34de7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-plot-doc-en \
texlive-pst-plot-doc"

RDEPENDS:${PN} += ""

inherit rpm
