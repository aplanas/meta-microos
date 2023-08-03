SUMMARY = "Process trailing punctuation which may be redundant"
DESCRIPTION = "The package provides commands that enable the user (or package \
writer) to insert punctuation after the macro. The method is \
similar to that of xspace, but goes further. The package \
provides the commands \\xperiod, \\xcomma and \\xperiodcomma, \
which follow a similar procedure to that of \\xspace, and insert \
punctuation if and only if it is necessary."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn26641"

RPM_NAME = "texlive-xpunctuate-2023.209.1.0svn26641-53.1.noarch.rpm"
RPM_HASH = "aa56cafad68a8d9462fd148a552fca3f3f26bd032033d7f726ccd3e5c259924d98e8df071ca89f637b6ab4e2598c3d490bc6aa33a39bd337b20fe8f79a014107"
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
