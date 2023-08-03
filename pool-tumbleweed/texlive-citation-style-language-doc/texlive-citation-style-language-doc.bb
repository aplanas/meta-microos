SUMMARY = "Documentation for texlive-citation-style-language"
DESCRIPTION = "This package includes the documentation for texlive-citation-style-language"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3.0svn65878"

RPM_NAME = "texlive-citation-style-language-doc-2023.209.0.0.3.0svn65878-54.1.noarch.rpm"
RPM_HASH = "99261428425371e260314c8c7f980c0c968ad908784a29ee121b80e7392c27d0049ceb66083d24ecade3469682b66e310c50d79600bb97b6e8aa451bf9af88bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-citeproc-lua.1 \
texlive-citation-style-language-doc"

RDEPENDS:${PN} += ""

inherit rpm
