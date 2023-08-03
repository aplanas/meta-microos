SUMMARY = "Typset index entries in Spanish documents"
DESCRIPTION = "This package helps you to create indexes in Spanish. With \
esindex you can write, say, \\esindex{canon} and the entry will \
be correctly alphabetized in the index. This release of esindex \
works with accented characters in any encoding, and without \
babel."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.7svn52342"

RPM_NAME = "texlive-esindex-2023.209.1.7svn52342-54.1.noarch.rpm"
RPM_HASH = "db09435b846fb5f9c9dfcef38438bf4901a5782ee39278a0cb654751a7135e16ec048767c5222943b48e9b2ff72fe74eeadd365d97a543bd40238f644c7b4446"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-esindex.sty \
texlive-esindex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
