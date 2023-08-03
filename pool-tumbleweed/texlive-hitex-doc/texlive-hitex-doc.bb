SUMMARY = "Documentation for texlive-hitex"
DESCRIPTION = "This package includes the documentation for texlive-hitex"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn65883"

RPM_NAME = "texlive-hitex-doc-2023.209.svn65883-54.1.noarch.rpm"
RPM_HASH = "a2656f5d6bdd4b75ae30be120706e5de46940d1e7bbcceb1600ddf9daac0e3cae8a59a319908bded427362324c621acb14829ee66051565f5392ef423c6f6dc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-hishrink.1 \
man-histretch.1 \
man-hitex.1 \
texlive-hitex-doc"

RDEPENDS:${PN} += ""

inherit rpm
