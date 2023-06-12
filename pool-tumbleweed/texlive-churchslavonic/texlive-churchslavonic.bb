SUMMARY = "Typeset documents in Church Slavonic language using Unicode"
DESCRIPTION = "The package provides fonts, hyphenation patterns, and \
supporting macros to typeset Church Slavonic texts. It depends \
on the following other packages: fonts-churchslavonic, \
hyph-utf8, intcalc, etoolbox, and xcolor."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2.1svn42751"

RPM_NAME = "texlive-churchslavonic-2023.201.0.0.2.1svn42751-53.1.noarch.rpm"
RPM_HASH = "6c67109a50a24ff48bef1b9d4fc2611ed59fcce28be0cc25aebca70ea31648131581579e7af9f40c015c4f89df674526c7b3dae00d0194cc83773c96c4c76f59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(churchslavonic.sty) \
tex(cu-calendar.sty) \
tex(cu-kinovar.sty) \
tex(cu-num.sty) \
tex(cu-util.sty) \
tex(gloss-churchslavonic.ldf) \
texlive-churchslavonic"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(etoolbox.sty) \
tex(intcalc.sty) \
tex(xcolor.sty) \
texlive \
texlive-etoolbox \
texlive-filesystem \
texlive-fonts-churchslavonic \
texlive-hyphen-churchslavonic \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-oberdiek \
texlive-scripts \
texlive-scripts-bin \
texlive-xcolor"

inherit rpm
