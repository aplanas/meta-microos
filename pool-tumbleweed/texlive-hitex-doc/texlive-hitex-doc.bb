SUMMARY = "Documentation for texlive-hitex"
DESCRIPTION = "This package includes the documentation for texlive-hitex"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65883"

RPM_NAME = "texlive-hitex-doc-2023.201.svn65883-53.1.noarch.rpm"
RPM_HASH = "97c06ce031204971e3919b1cfd178ba85a5c50026fa4193a3cce5183e965201287a6ace20c372561b061c98d065100986283a56174ff9932ed1101ed799d88ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-hishrink.1 \
man-histretch.1 \
man-hitex.1 \
texlive-hitex-doc"

RDEPENDS:${PN} += ""

inherit rpm
