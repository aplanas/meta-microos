SUMMARY = "Fonts and macros to typeset ancient Greek"
DESCRIPTION = "Ibycus is a Greek typeface, based on Silvio Levy's realisation \
of a classic Didot cut of Greek type from around 1800. The \
fonts are available both as Metafont source and in Adobe Type 1 \
format. This distribution of ibycus is accompanied by a set of \
macro packages to use it with Plain TeX or LaTeX, but for use \
with Babel, see the ibycus-babel package."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.4.5svn15878"

RPM_NAME = "texlive-ibygrk-2023.209.4.5svn15878-54.1.noarch.rpm"
RPM_HASH = "b2c808eead43bb19e6d32a36b08221edb923fbf7066392c0605718215f36515bb93696c50bf76ec6632153fadf61396645854270864e17b9be4729dd2fcc20e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-IbycusHTG.enc \
tex-Uibycus.fd \
tex-Uibycus4.fd \
tex-fibb84.tfm \
tex-fibb848.tfm \
tex-fibb849.tfm \
tex-fibo84.tfm \
tex-fibo848.tfm \
tex-fibo849.tfm \
tex-fibr84.tfm \
tex-fibr848.tfm \
tex-fibr849.tfm \
tex-iby.map \
tex-iby4extr.tex \
tex-ibycus4.map \
tex-ibycus4.sty \
tex-ibycus4.tex \
tex-ibycusps.tex \
tex-psibycus.sty \
tex-pssetiby.tex \
tex-setiby4.tex \
tex-tlgsqq.tex \
tex-version4.tex \
texlive-ibygrk"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-ibygrk-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
