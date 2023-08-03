SUMMARY = "Typeset documents in Church Slavonic language using Unicode"
DESCRIPTION = "The package provides fonts, hyphenation patterns, and \
supporting macros to typeset Church Slavonic texts. It depends \
on the following other packages: fonts-churchslavonic, \
hyph-utf8, intcalc, etoolbox, and xcolor."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2.1svn42751"

RPM_NAME = "texlive-churchslavonic-2023.209.0.0.2.1svn42751-54.1.noarch.rpm"
RPM_HASH = "21a90897085020794a49ab6aa0e97e603ec371e845a3960883256e9e4999bc2c967409d8b192d6de291906ed42758eff607758e42ebcad98f50ba98c91c891d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-churchslavonic.sty \
tex-cu-calendar.sty \
tex-cu-kinovar.sty \
tex-cu-num.sty \
tex-cu-util.sty \
tex-gloss-churchslavonic.ldf \
texlive-churchslavonic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-intcalc.sty \
tex-xcolor.sty \
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
