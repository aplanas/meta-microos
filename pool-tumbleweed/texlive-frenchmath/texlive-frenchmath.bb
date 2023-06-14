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

PV = "2023.201.2.6svn66470"

RPM_NAME = "texlive-frenchmath-2023.201.2.6svn66470-52.1.noarch.rpm"
RPM_HASH = "2a123e8e5871310806a41c1df10b2f62cbcd3eb8fafbb74cf7226b06ae7dc9ff9cfef3ea47c3be4f91fc72e800ee8b63341e198bfccf79bff1d82d4b152c792c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-frenchmath.sty \
texlive-frenchmath"

RDEPENDS:${PN} += "/bin/sh \
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
