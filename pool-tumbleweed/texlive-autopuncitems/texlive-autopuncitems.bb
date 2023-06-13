SUMMARY = "Automatically punctuate lists"
DESCRIPTION = "This package provides the autopunc option in the enumitem \
environments itemize, enumerate, and description to \
automatically punctuate the items. It uses lua pattern matching \
to modify the environment's contents."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn63045"

RPM_NAME = "texlive-autopuncitems-2023.201.svn63045-53.1.noarch.rpm"
RPM_HASH = "fef3d09ebe841080244206792d57e361586d90e7f2053d74419083ff54b756185be930507fcfef13153e0c759669126950a9596d85debf7c01513cfc7fc9185e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(autopuncitems.sty) \
texlive-autopuncitems"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(enumitem.sty) \
tex(etoolbox.sty) \
tex(luacode.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
