SUMMARY = "Documentation for texlive-xetex"
DESCRIPTION = "This package includes the documentation for texlive-xetex"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66203"

RPM_NAME = "texlive-xetex-doc-2023.201.svn66203-52.2.noarch.rpm"
RPM_HASH = "19376a8d4120647ad0175fe0bdc2d9b2d051889b9556fcd1011e656812b1f85d1f7b057a358885a5f0012ae10f6c19bfdac668264d5a04f85494cf9b1adc8f23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-xelatex-unsafe.1 \
man-xelatex.1 \
man-xetex-unsafe.1 \
man-xetex.1 \
texlive-xetex-doc"

RDEPENDS:${PN} += ""

inherit rpm
