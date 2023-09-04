SUMMARY = "Documentation for texlive-zxjafbfont"
DESCRIPTION = "This package includes the documentation for texlive-zxjafbfont"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn28539"

RPM_NAME = "texlive-zxjafbfont-doc-2023.209.0.0.2svn28539-53.2.noarch.rpm"
RPM_HASH = "23f54327462f0c7e74b204c708a0983df7f92019f2d61d6fc6db20e786c0b01a7f32eb96e02079292ddcc1e8896ee3bebb930f69b779a1324df0a10be1f621e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zxjafbfont-doc"

RDEPENDS:${PN} += ""

inherit rpm
