SUMMARY = "Process trailing punctuation which may be redundant"
DESCRIPTION = "The package provides commands that enable the user (or package \
writer) to insert punctuation after the macro. The method is \
similar to that of xspace, but goes further. The package \
provides the commands \\xperiod, \\xcomma and \\xperiodcomma, \
which follow a similar procedure to that of \\xspace, and insert \
punctuation if and only if it is necessary."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn26641"

RPM_NAME = "texlive-xpunctuate-2023.209.1.0svn26641-53.2.noarch.rpm"
RPM_HASH = "e6a6ee0cfb5fa5f30c4839d6f665518c5acbda07176acda33926d07c6176c03f7538c7b2d61228dac3f00fe82b2925a882885658eb010270790019eb43f405d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xpunctuate.sty \
texlive-xpunctuate"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
