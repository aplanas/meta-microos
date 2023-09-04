SUMMARY = "Typset index entries in Spanish documents"
DESCRIPTION = "This package helps you to create indexes in Spanish. With \
esindex you can write, say, \\esindex{canon} and the entry will \
be correctly alphabetized in the index. This release of esindex \
works with accented characters in any encoding, and without \
babel."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.7svn52342"

RPM_NAME = "texlive-esindex-2023.209.1.7svn52342-54.2.noarch.rpm"
RPM_HASH = "bff1ae255d73d634cba1aef8e20b2b9cac011b11225416fba0a4ad088fbac924936abe86f3253d7ea49611bb3fa020346aef8609ecfb3cb8e1e4c8c75d61d764"
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
