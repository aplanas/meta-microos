SUMMARY = "Extended versions of standard BibTeX styles"
DESCRIPTION = "The bundle contains an extended version (xbtxbst.doc) of the \
source of the standard BibTeX styles, together with \
corresponding versions of the standard styles. The styles offer \
support for CODEN, ISBN, ISSN, LCCN, and PRICE fields, extended \
PAGES fields, the PERIODICAL entry, and extended citation label \
suffixing."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.03svn52623"

RPM_NAME = "texlive-is-bst-2023.201.2.03svn52623-55.1.noarch.rpm"
RPM_HASH = "d3a4767717be6ee4c263654397908f342bec62c840f9a2543fc1b4023de420d7fd8cf0beec3866bdaa700f70881f53868e1f9f7de3ca438bf676214406339db7"
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
