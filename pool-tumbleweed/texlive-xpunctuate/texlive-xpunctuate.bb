SUMMARY = "Process trailing punctuation which may be redundant"
DESCRIPTION = "The package provides commands that enable the user (or package \
writer) to insert punctuation after the macro. The method is \
similar to that of xspace, but goes further. The package \
provides the commands \\xperiod, \\xcomma and \\xperiodcomma, \
which follow a similar procedure to that of \\xspace, and insert \
punctuation if and only if it is necessary."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn26641"

RPM_NAME = "texlive-xpunctuate-2023.201.1.0svn26641-52.2.noarch.rpm"
RPM_HASH = "3ab9224e8396dbcebc6e9f0b388209e11398cf7ed3e363c0da9a32818b86904ad90a126d77643ff8f5dfcc0faa357c644d504f74f1e5b5e552a17a88f282dd08"
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
