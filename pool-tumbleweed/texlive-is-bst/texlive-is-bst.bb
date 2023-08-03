SUMMARY = "Extended versions of standard BibTeX styles"
DESCRIPTION = "The bundle contains an extended version (xbtxbst.doc) of the \
source of the standard BibTeX styles, together with \
corresponding versions of the standard styles. The styles offer \
support for CODEN, ISBN, ISSN, LCCN, and PRICE fields, extended \
PAGES fields, the PERIODICAL entry, and extended citation label \
suffixing."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.03svn52623"

RPM_NAME = "texlive-is-bst-2023.209.2.03svn52623-56.1.noarch.rpm"
RPM_HASH = "af5b3decbc900554b7afd806272045d2b9ad5b8773eeaeb3add7f68b7908329d65052fd419acb55150f001ba46fd09b9450dc86e105e9b8dede634654550ab10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-is-bst"

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
