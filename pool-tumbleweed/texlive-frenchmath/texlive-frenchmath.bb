SUMMARY = "Typesetting mathematics according to French rules"
DESCRIPTION = "The package provides capital letters in roman (upright shape) \
in mathematical mode according to French rule (can be \
optionnally disabled), optionally lowercase Greek letters in \
upright shape, correct spacing in math mode after commas, \
before a semicolon and around square brackets, some useful \
macros and aliases for symbols used in France: \\infeg, \\supeg, \
\\paral, ... several macros for writing french operator names \
like pgcd, ppcm, Card, rg, Vect, ..."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.6svn66470"

RPM_NAME = "texlive-frenchmath-2023.209.2.6svn66470-53.1.noarch.rpm"
RPM_HASH = "fcac3b21f16b1daf97234aa49b84c5890636bbb53d0d5dbb78130cc87ebd7c77a49dcb731fd40f4466c34170ec1f1fd26a5316f89f923bedab151ef8c29c917c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-frenchmath.sty \
texlive-frenchmath"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsopn.sty \
tex-amssymb.sty \
tex-dotlessj.sty \
tex-ibrackets.sty \
tex-iftex.sty \
tex-lgrmath.sty \
tex-mathptmx.sty \
tex-mathrsfs.sty \
tex-ncccomma.sty \
tex-upgreek.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
