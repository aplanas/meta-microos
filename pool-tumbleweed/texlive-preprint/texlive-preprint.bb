SUMMARY = "A bundle of packages provided 'as is'"
DESCRIPTION = "The bundle comprises: authblk, which permits footnote style \
author/affiliation input in the \\author command, balance, to \
balance the end of \\twocolumn pages, figcaps, to send figure \
captions, etc., to end document, fullpage, to set narrow page \
margins and set a fixed page style, and sublabel, which permits \
counters to be subnumbered."
LICENSE = "LPPL-1.0"

PV = "2023.201.2011svn30447"

RPM_NAME = "texlive-preprint-2023.201.2011svn30447-52.1.noarch.rpm"
RPM_HASH = "dc7a285846088da9c1bae3bf5774f2fbb2be35aed2eeddaa926496d53932c607c5b89ed98675d7492fac21c0d6f271820cea478f1b43c939c766b258fa6d6ba0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(authblk.sty) \
tex(balance.sty) \
tex(figcaps.sty) \
tex(fullpage.sty) \
tex(sublabel.sty) \
texlive-preprint"
RDEPENDS:${PN} += "/bin/sh \
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
