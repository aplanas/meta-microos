SUMMARY = "Documentation for texlive-hitex"
DESCRIPTION = "This package includes the documentation for texlive-hitex"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn65883"

RPM_NAME = "texlive-hitex-doc-2023.209.svn65883-54.2.noarch.rpm"
RPM_HASH = "60c60485d2ce1b120d0fd26c89ba9759f1381223f1cdaeb70a3cd46abef86292fba6544338558960b945480672f429ee26177365d225b865bf88d6531cf79246"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-hishrink.1 \
man-histretch.1 \
man-hitex.1 \
texlive-hitex-doc"

RDEPENDS:${PN} += ""

inherit rpm
