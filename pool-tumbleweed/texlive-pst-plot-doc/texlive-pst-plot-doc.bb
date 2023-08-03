SUMMARY = "Documentation for texlive-pst-plot"
DESCRIPTION = "This package includes the documentation for texlive-pst-plot"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.94svn65346"

RPM_NAME = "texlive-pst-plot-doc-2023.209.1.94svn65346-54.1.noarch.rpm"
RPM_HASH = "4712029d79a609c7bbef3153cc1348efa198fca58f8590d7693a62063febd2c939afabe25f264ca3e6f56c1ecb639e5967c979e9d790b3dd59a4c75a1b2659da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-plot-doc-en \
texlive-pst-plot-doc"

RDEPENDS:${PN} += ""

inherit rpm
