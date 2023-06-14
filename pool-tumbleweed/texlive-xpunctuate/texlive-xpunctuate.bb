SUMMARY = "Process trailing punctuation which may be redundant"
DESCRIPTION = "The package provides commands that enable the user (or package \
writer) to insert punctuation after the macro. The method is \
similar to that of xspace, but goes further. The package \
provides the commands \\xperiod, \\xcomma and \\xperiodcomma, \
which follow a similar procedure to that of \\xspace, and insert \
punctuation if and only if it is necessary."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn26641"

RPM_NAME = "texlive-xpunctuate-2023.201.1.0svn26641-52.1.noarch.rpm"
RPM_HASH = "c239f2cbe11ad396b86acb9b173c9730b262092a525747b1740aaf0754d0222b7055cf736089b2d5e9435c16520fab10abdbbd224b7466042295eb10c8e6bbc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xpunctuate.sty \
texlive-xpunctuate"

RDEPENDS:${PN} += "/bin/sh \
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
