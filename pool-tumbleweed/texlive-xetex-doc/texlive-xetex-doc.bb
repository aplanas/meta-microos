SUMMARY = "Documentation for texlive-xetex"
DESCRIPTION = "This package includes the documentation for texlive-xetex"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn66203"

RPM_NAME = "texlive-xetex-doc-2023.209.svn66203-53.1.noarch.rpm"
RPM_HASH = "a38b1bad7e996a7362a5163b77d476d8a28fe8ec3847a0233d1964582b0777f9ff12bd52f57c0eb880f461c094734aca7a9e9cecdfaef0de720f63bfb4ab556e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-xelatex-unsafe.1 \
man-xelatex.1 \
man-xetex-unsafe.1 \
man-xetex.1 \
texlive-xetex-doc"

RDEPENDS:${PN} += ""

inherit rpm
